/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SpringJsonResponseApplication.
 */
@EnableWebMvc
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableSwagger2
public class SpringJsonResponseApplication {
	
	@Autowired
	private TypeResolver typeResolver;
	
	@Value("${app.version}")
	private String appVersion;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringJsonResponseApplication.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.anglobal.spring.jsonresponse.controller")).build()
				.pathMapping("/").apiInfo(apiInfo());

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Microservicio Mockup que emula la respuesta del gatewayap y el componente de autenticación")
				.description("Devuelve la respuesta simulada del gatewayap y el componente de autenticación")
				.version(appVersion).build();
	}
	
}
