package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentchain extends BaseClass {
	@Test
	public void create() {
		// Add request 
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"short_description\": \"Laptop service\",\r\n"
				+ "    \"description\": \"Laptop charging point problem\"\r\n"
				+ "}");
		//send the request
		
		Response response = inputRequest.post("incident");
		sys_id=response.jsonPath().getString("result.sys_id");
		System.out.println("Sys id  :"+sys_id);
		incNum=response.jsonPath().getString("result.number");
		System.out.println("Incident number :"+incNum);
		// Print the response
		response.prettyPrint();
	}

}
