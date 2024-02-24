package Week3day1;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIncidents {
	
	@Test	
	public void getAll() {
		//Add Endpoints
		
				RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
				
				//Add Authentication
				
				RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
				
				//No Request body for GET request
				//Initiate request
				Response response = RestAssured.get("Incident");
				response.prettyPrint();
				
			
		
	}

}
