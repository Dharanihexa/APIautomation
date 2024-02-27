package AssertionW3d2;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AsertCreateIncident {
	
@Test
	
	public void create() {
		
		//Add Endpoints
		
		RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
		
		//Add Authentication
		
		RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
		// save resquest body in json file
		File file = new File("./src/test/resources/CreateIncident.json");
		//Call this file in a request
		RequestSpecification inputRequest=RestAssured.given().contentType("application/json").when().body(file);
		//initiate request
		Response response=inputRequest.post("incident");
		//Assert the description with partial match
		response.then().assertThat().body("result.description",Matchers.containsString("charging point problem"));
		
}
}
