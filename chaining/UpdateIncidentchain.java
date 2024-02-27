package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncidentchain extends BaseClass {
	@Test(dependsOnMethods= "chaining.CreateIncidentchain.create")	
	public void update() {
			// Add request 
			RequestSpecification inputRequest = RestAssured.given().contentType("application/json")
					.when().body("{\r\n"
					+ "    \"short_description\": \"Mobile Problem\",\r\n"
					+ "    \"description\": \"Mobile display issue\"\r\n"
					+ "}");
			//Initiate request
			
			Response response = inputRequest.put("incident/"+sys_id);
			
			// Print the response
			response.prettyPrint();

}
}
