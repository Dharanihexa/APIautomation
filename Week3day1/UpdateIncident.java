package Week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident {
	@Test	
	public void update() {
	
	//Add Endpoints Base URI
	
			RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
			
			//Add Authentication
			
			RestAssured.authentication= RestAssured.basic("admin","Sri&advs24");
			
			// Add request 
			
			RequestSpecification inputRequest = RestAssured.given().contentType("application/json")
					.when().body("{\r\n"
					+ "    \"short_description\": \"Mobile Problem\",\r\n"
					+ "    \"description\": \"Mobile display issue\"\r\n"
					+ "}");
			//Initiate request
			
			Response response = inputRequest.put("incident/5ef3cb252fe042105adc52492799b68a");
			
			// Print the response
			response.prettyPrint();

}
}
