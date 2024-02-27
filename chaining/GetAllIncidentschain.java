package chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIncidentschain extends BaseClass{
	
	@Test(dependsOnMethods = "chaining.CreateIncidentchain.create")	
	public void getAll() {
		
				//No Request body for GET request
				//Initiate request
				Response response = RestAssured.get("incident");
				response.prettyPrint();
				response.then().assertThat().body("result.number", Matchers.hasItem(incNum));
				System.out.println("Incident number : "+incNum);
				
			
		
	}

}
