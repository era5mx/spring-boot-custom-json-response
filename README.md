# spring-boot-json-response
This is a dummy Spring Boot 2.3.5.RELEASE application with Swagger2 to demonstrate a way to provide JSON response from server. Typically, it can be used while developing a RESTful web service.

This project has been built with Eclipse IDE Version: 2020-09 (4.17.0), Apache Maven 3.6.3 y Java(TM) SE Runtime Environment (build 1.8.0_271-b09)

# Prerequisites
Import the project into eclipse and run the command: `mvn eclipse: eclipse install`

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
	
