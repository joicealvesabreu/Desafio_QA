package Test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;


public class PostTest {

	@Test
	public void post()  {
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
/*		Map<String, Object>  map = new HashMap<>();
		map.put("estoqueForm", "");
		map.put("id", "6");
		map.put("quantidade", "34");
		map.put("id", "3");
		map.put("materiaisDeProducaoForm", "");
		map.put("id", "8");
		map.put("nome", "vestido");
		map.put("materiaisDeProducaoDTO", "");
		map.put("quantidadeEmEstoque", "67");
*/
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
			.post("/material")
		.then()
			.log().all()
			.statusCode(201);
		
	}
	
	
	
	
	
	
	
}
