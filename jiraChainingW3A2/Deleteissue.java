package jiraChainingW3A2;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deleteissue extends Base{

	@Test(dependsOnMethods="jiraChainingW3A2.updateissue.update")
	public void delete() {
		
		//No Request body for Delete request
		//Initiate request
		Response response = RestAssured.delete("rest/api/2/issue/"+issueid);
		int statuscode= response.getStatusCode();
		System.out.println("Delete status code :" + statuscode);
		response.then().assertThat().statusCode(Matchers.equalTo(204));
		
	}
}
