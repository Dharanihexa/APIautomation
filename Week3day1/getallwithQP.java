package Week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getallwithQP {
	@Test
	public void get() {
		//Add Endpoints
		
		RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
		
		//Add Authentication
		
		RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
		
		//add Query parameter
	    RequestSpecification inputrequest = RestAssured.given().queryParam("sysparm_fields", "description,short_description,sys_id");
//	    		.contentType("application/json").when().body("{\r\n"
//				+ "    \"short_description\": \"Laptop service\",\r\n"
//				+ "    \"description\": \"Laptop charging point problem\"\r\n"
//				+ "}");
		
	    //Initiate request
	    Response response=inputrequest.get("incident");
	    response.prettyPrint();
	}

}
