# spring-boot-jsonresponse
This is a dummy Spring Boot 2.3.5.RELEASE application with Swagger2 to demonstrate a way to provide JSON response from server. Typically, it can be used while developing a RESTful web service.

This project has been built with Eclipse IDE Version: 2020-09 (4.17.0), Apache Ant(TM) version 1.10.9, Apache Maven 3.6.3 y Java(TM) SE Runtime Environment (build 1.8.0_271-b09)

# Prerequisites
1. Environment variable JAVA_HOME is set.
2. Environment variable M2_HOME is set.
4. Environment variable CLASSPATH is set and contains at least one element from JAVA_HOME and at least one element from M2_HOME.
5. Import the project into eclipse and run the command: `mvn eclipse:clean eclipse:eclipse install`

# Custom
This dummy use PersonDTO object if need a custom dummy you can generate plain old java objects and implement the custom components 

# Generate Plain Old Java Objects from JSON or JSON-Schema (http://www.jsonschema2pojo.org/)

Example:
	Package: com.at.spring.jsonresponse.dto
	Class name: CustomDTO
	Target language: Java
	Source type: JSON
	Annotation style: None

# Test
To test, execute the command:
	`mvn clean package`

Then, execute the command:
	`java -jar target\spring-boot-jsonresponse-1.0.jar`

So, using the values of the server.servlet-path and server.port defined in the src / main / resources / application.properties file
open a browser to..

	http://localhost:{server.port}/{server.servlet-path}/swagger-ui.html (UI Docs)
	http://localhost:{server.port}/{server.servlet-path}/v2/api-docs (JSON Docs)	
	
