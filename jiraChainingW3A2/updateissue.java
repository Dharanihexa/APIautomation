package jiraChainingW3A2;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateissue extends Base{
		@Test(dependsOnMethods="jiraChainingW3A2.CreateIssueJira.createissue")
		public void update() {
		
				// Add request 
				
				RequestSpecification inputRequest = RestAssured.given().contentType("application/json")
						.when().body("{\r\n"
								+ "    \"fields\": {\r\n"
								+ "\r\n"
								+ "        \"description\": \"Bug updation Using REST API for testing\"\r\n"
								+ "    }\r\n"
								+ "}");
				//Initiate request
				
				Response response = inputRequest.put("rest/api/2/issue/"+issueid);
				int statuscode= response.getStatusCode();
				System.out.println("Update status code :" + statuscode);
				response.then().assertThat().statusCode(Matchers.equalTo(204));
				
				// Print the response
				response.prettyPrint();

	}
}
