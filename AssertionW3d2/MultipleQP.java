package AssertionW3d2;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MultipleQP {
	@Test	
	public void getAll() {
		
		Map<String , String> inputMap= new HashMap<>();
		inputMap.put("sysparm_fields", "description,short_description,sys_id");
		inputMap.put("sysparm_limit", "3");
		//Add Endpoints
		
				RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
				
				//Add Authentication
				
				RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
				//Multiple query param
				Response response=RestAssured.given().queryParams(inputMap).get("incident");
				//No Request body for GET request
				//Initiate request

				response.prettyPrint();
				
			
		
	}


}
