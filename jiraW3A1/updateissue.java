package jiraW3A1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateissue {
		@Test	
		public void update() {
		
			//add URI
			RestAssured.baseURI="https://automaterestapi-testing.atlassian.net/";
			
			//Add Authentication
			RestAssured.authentication=RestAssured.preemptive().basic("dharanithiruvenkadaraja@gmail.com", "ATATT3xFfGF0f-Co3M9yiRDoTG-ypHujth_h8SfNhGSBjsIORg7oqv1wCmiy1BKu0fHttvyNqLXCBKt5665hA1MGtDOjPZayREB53SK4PUsvXRk9L7USeqWvHRGlim9VOGkUrEHzhQepbGtLEMb100GiriCHCE_hLBPhlN37tTTloAWzCgZn7VA=68D592C4");
				
				// Add request 
				
				RequestSpecification inputRequest = RestAssured.given().contentType("application/json")
						.when().body("{\r\n"
								+ "    \"fields\": {\r\n"
								+ "\r\n"
								+ "        \"description\": \"Bug updation Using REST API for testing\"\r\n"
								+ "    }\r\n"
								+ "}");
				//Initiate request
				
				Response response = inputRequest.put("rest/api/2/issue/10012");
				
				// Print the response
				response.prettyPrint();

	}
}
