package jiraW3A1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssueJira {
	@Test
	public void createissue() {
		
		//add URI
		RestAssured.baseURI="https://automaterestapi-testing.atlassian.net/";
		
		//Add Authentication
		RestAssured.authentication=RestAssured.preemptive().basic("dharanithiruvenkadaraja@gmail.com", "ATATT3xFfGF0f-Co3M9yiRDoTG-ypHujth_h8SfNhGSBjsIORg7oqv1wCmiy1BKu0fHttvyNqLXCBKt5665hA1MGtDOjPZayREB53SK4PUsvXRk9L7USeqWvHRGlim9VOGkUrEHzhQepbGtLEMb100GiriCHCE_hLBPhlN37tTTloAWzCgZn7VA=68D592C4");
		//Request body
		
	RequestSpecification inputRequest =RestAssured.given().contentType("application/json").when().body("{\r\n"
			+ "    \"fields\": {\r\n"
			+ "    \"project\":\r\n"
			+ "                {\r\n"
			+ "                    \"key\": \"JIR\"\r\n"
			+ "                },\r\n"
			+ "    \"summary\": \"create issue in RA project\",\r\n"
			+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
			+ "    \"issuetype\": {\r\n"
			+ "                    \"name\": \"Bug\"\r\n"
			+ "                }\r\n"
			+ "    }\r\n"
			+ "}\r\n"
			+ "");
	//send the request
	
			Response response = inputRequest.post("rest/api/2/issue/");
			String issueid=response.jsonPath().getString("id");
			// Print the response
			response.prettyPrint();
	}

}
