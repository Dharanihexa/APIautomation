package jiraChainingW3A2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssueJira extends Base{
	@Test
	public void createissue() {
		
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
			issueid=response.jsonPath().getString("id");
			// Print the response
			response.prettyPrint();
	}

}
