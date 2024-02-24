package Week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident {

	@Test
	public void delete() {
		//Add Endpoints
		
		RestAssured.baseURI= ("https://dev144375.service-now.com/api/now/table/");
		
		//Add Authentication
		
		RestAssured.authentication= RestAssured.basic("admin", "Sri&advs24");
		
		//No Request body for Delete request
		//Initiate request
		Response response = RestAssured.delete("incident/5ef3cb252fe042105adc52492799b68a");
		int statuscode= response.getStatusCode();
		System.out.println("Delete status code :" + statuscode);
		
	
	}
}
