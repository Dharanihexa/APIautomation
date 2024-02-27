package jiraW3A1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deleteissue {

	@Test
	public void delete() {
		//add URI
		RestAssured.baseURI="https://automaterestapi-testing.atlassian.net/";
		
		//Add Authentication
		RestAssured.authentication=RestAssured.preemptive().basic("dharanithiruvenkadaraja@gmail.com", "ATATT3xFfGF0f-Co3M9yiRDoTG-ypHujth_h8SfNhGSBjsIORg7oqv1wCmiy1BKu0fHttvyNqLXCBKt5665hA1MGtDOjPZayREB53SK4PUsvXRk9L7USeqWvHRGlim9VOGkUrEHzhQepbGtLEMb100GiriCHCE_hLBPhlN37tTTloAWzCgZn7VA=68D592C4");
					
		//No Request body for Delete request
		//Initiate request
		Response response = RestAssured.delete("rest/api/2/issue/10012");
		int statuscode= response.getStatusCode();
		System.out.println("Delete status code :" + statuscode);
		
	
	}
}
