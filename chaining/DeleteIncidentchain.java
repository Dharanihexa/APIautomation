package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncidentchain extends BaseClass{

	@Test(dependsOnMethods = "chaining.UpdateIncidentchain.update")
	public void delete() {
		
		//No Request body for Delete request
		//Initiate request
		Response response = RestAssured.delete("incident/"+sys_id);
		int statuscode= response.getStatusCode();
		System.out.println("Delete status code :" + statuscode);
		
	
	}
}
