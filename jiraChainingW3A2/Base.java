package jiraChainingW3A2;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class Base {
	public static String issueid;
	
	@BeforeMethod
	public void baseclass() {
		//add URI
				RestAssured.baseURI="https://automaterestapi-testing.atlassian.net/";
				
				//Add Authentication
				RestAssured.authentication=RestAssured.preemptive().basic("dharanithiruvenkadaraja@gmail.com", "ATATT3xFfGF0f-Co3M9yiRDoTG-ypHujth_h8SfNhGSBjsIORg7oqv1wCmiy1BKu0fHttvyNqLXCBKt5665hA1MGtDOjPZayREB53SK4PUsvXRk9L7USeqWvHRGlim9VOGkUrEHzhQepbGtLEMb100GiriCHCE_hLBPhlN37tTTloAWzCgZn7VA=68D592C4");
				//Request body
				
	}

}
