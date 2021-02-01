package Test;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;

public class deleteTest {
	
	@Test
	public void Delete() {

	RestAssured.given()
	.when().delete("/material/4").then().log().all().statusCode(200);
	

	}
}
