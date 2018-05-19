# spring-boot-json-response
This is a dummy Spring Boot 1.5.13.RELEASE application with Swagger2 to demonstrate a way to provide JSON response from server. Typically, it can be used while developing a RESTful web service.

This is a forked from ashyboyofficial/spring-boot-json-response which is a dummy Spring Boot 1.3.0.RELEASE application

# Custom
This dummy use PersonDTO object if need a custom dummy you can generate plain old java objects and implement the custom components 

# Generate Plain Old Java Objects from JSON or JSON-Schema (http://www.jsonschema2pojo.org/)

Example:
	Package: com.anglobal.spring.jsonresponse.dto
	Class name: CustomDTO
	Target language: Java
	Source type: JSON
	Annotation style: None

# Test
To test, execute the command:
	mvn clean package

Then, execute the command:
	java -jar target\jsonresponse-1.0.jar
	
So, open a browser to
	
	http://localhost:8080/v2/api-docs
	http://localhost:8080/api/swagger-resources
	http://localhost:8080/swagger-ui.html
	
