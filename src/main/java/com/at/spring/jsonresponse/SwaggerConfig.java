/*
* 
 * Todos los derechos reservados
 */
package com.at.spring.jsonresponse;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig.
 */
@EnableWebMvc
@ConditionalOnWebApplication
@SpringBootApplication
@EnableSwagger2
/* @ComponentScan(basePackageClasses = {
		JSONResponseCustomController.class
}) */
public class SwaggerConfig implements WebMvcConfigurer {
	
	@Autowired
	private TypeResolver typeResolver;
	
	@Value("${server.servlet.context-path")
	private String basePath;
	@Value("${app.version}")
	private String appVersion;
	
	@Value("${contact.author}")
	private String author;
	@Value("${contact.url}")
	private String url;
	@Value("${contact.email}")
	private String email;
	
    final String apiDocs = "/v2/api-docs";
    final String configUi = "/swagger-resources/configuration/ui";
    final String configSecurity = "/swagger-resources/configuration/security";
    final String resources = "/swagger-resources";

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SwaggerConfig.class, args);
	}
	
	@Bean
	public Docket newsApi(TypeResolver typeResolver) {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.at.spring.jsonresponse.controller"))
				.paths(PathSelectors.any()) //.paths(PathSelectors.regex("/api/.*"))
				.build()
				.pathMapping("/")
				.directModelSubstitute(LocalDate.class, String.class)
		        .genericModelSubstitutes(ResponseEntity.class)
		        .useDefaultResponseMessages(false)
		        .enableUrlTemplating(true)
			    .alternateTypeRules(
			            AlternateTypeRules.newRule(
			                typeResolver.resolve(DeferredResult.class,
			                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
			                typeResolver.resolve(WildcardType.class)),
			            AlternateTypeRules.newRule(
			                typeResolver.resolve(Collection.class, WildcardType.class),
			                typeResolver.resolve(List.class, WildcardType.class)))
			    .apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		Contact contact = new Contact(author,url,email);
		return new ApiInfoBuilder()
				.title("Microservicio Mockup que emula la respuesta del gatewayap y el componente de autenticación")
				.description("Devuelve la respuesta simulada del gatewayap y el componente de autenticación")
				.version(appVersion)
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.contact(contact)
				.build();
	}
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addRedirectViewController(basePath + apiDocs, apiDocs).setKeepQueryParams(true);
        registry.addRedirectViewController(basePath + resources, resources);
        registry.addRedirectViewController(basePath + configUi, configUi);
        registry.addRedirectViewController(basePath + configSecurity, configSecurity);
        registry.addRedirectViewController(basePath, "/");
    }
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(basePath + "/**").addResourceLocations("classpath:/META-INF/resources/");
	    //registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
}
