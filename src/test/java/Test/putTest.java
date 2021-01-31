package Test;

import org.junit.Test;

import io.restassured.RestAssured;

public class putTest {

	@Test
	public void put()  {
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    RestAssured.given()
	.body("{\r\n" + 
			"  \"estoqueForm\": {\r\n" + 
			"    \"id\": 5,\r\n" + 
			"    \"quantidade\": 12\r\n" + 
			"  },\r\n" + 
			"  \"id\": 7,\r\n" + 
			"  \"materiaisDeProducaoForm\": [\r\n" + 
			"    {\r\n" + 
			"      \"id\": 1,\r\n" + 
			"      \"nome\": \"tecido\",\r\n" + 
			"      \"materiaisDeProducaoDTO\": null,\r\n" + 
			"      \"quantidadeEmEstoque\": 5\r\n" + 
			"    }\r\n" + 
			"  ],\r\n" + 
			"  \"nome\": \"camisa\"\r\n" + 
			"}")
	.when()
		.put("/material/5")
	.then()
		.log().all()
		.statusCode(201);
	
}
}
