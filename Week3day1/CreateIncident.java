package Week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident {
	
	@Test
	
	public void create() {
		
		//Add Endpoints
		
		RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
		
		//Add Authentication
		
		RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
		
		// Add request 
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"short_description\": \"Laptop service\",\r\n"
				+ "    \"description\": \"Laptop charging point problem\"\r\n"
				+ "}");
		//send the request
		
		Response response = inputRequest.post("incident");
		
		// Print the response
		response.prettyPrint();
	}

}
