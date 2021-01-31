package core;

import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class baseTest implements Constante {
	
	
	@BeforeClass
	public static void inicializa() {
		
		RestAssured.baseURI = URL_BASE;
		RestAssured.basePath = BASE_PATH;
		
		RequestSpecBuilder reqbuilder = new RequestSpecBuilder();
		reqbuilder.setContentType(CONTENT_TYPE);
		RestAssured.requestSpecification = reqbuilder.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}

}
