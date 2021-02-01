package Test;

import org.hamcrest.Matchers;
import org.junit.Test;




import core.baseTest;
import io.restassured.RestAssured;

public class getTest extends baseTest{
	
	
	
	@Test
	public void test()
	
	{
		
		RestAssured.given().param("materiaPrima", "true")
		.when().get("/material").then().log().all().statusCode(200).assertThat().body("size()", Matchers.is(6));
		
		
		
	}
	

}
