package Week3day1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assertresult {
	
	@Test
	public void postwithQP() {
		//Add Endpoints
		
		RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
		
		//Add Authentication
		
		RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
		
		//add Query parameter
	    RequestSpecification inputrequest = RestAssured.given().queryParam("sysparm_fields", "description,short_description,sys_id")
	    		.contentType("application/json").when().body("{\r\n"
				+ "    \"short_description\": \"Storage problem\",\r\n"
				+ "    \"description\": \"Laptop Stroage problem\"\r\n"
				+ "}");
		
	    //Initiate request
	    Response response=inputrequest.post("incident");
	    //Extract sys_id
	    String sys_id=response.jsonPath().getString("result.sys_id");
	    System.out.println("PostwithQA Sys ID :" +sys_id);
	    //Assert status code fail
	    response.then().assertThat().statusCode(Matchers.equalTo(200));
//	  //Assert status code Pass
//	    response.then().assertThat().statusCode(Matchers.equalTo(201));
	    //Print response
	    response.prettyPrint();
	}

}
