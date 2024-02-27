package chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	
	public static String sys_id;
	public static String incNum;
	
	@BeforeMethod
	public void base() { 

	        //Add Endpoints
			RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
			
			//Add Authentication
			RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
			
	}
}
