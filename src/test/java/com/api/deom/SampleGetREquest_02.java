package com.api.deom;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class SampleGetREquest_02 {

	
	@Test
	public void getRequestExample() {

	Response response = RestAssured.get("https://reqres.in/api/users/3");
	
	//response.getBody();
     ResponseBody responseBody = response.body();
	  
     //System.out.println(responseBody.asString());
     
     System.out.println(responseBody.asPrettyString());
		
		
	}

	@Test
	public void anotherGetRequestExample() {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		ValidatableResponse response = RestAssured
		.given()
		   .param("","")
		   .header("","")
		   .when()
		     .get("/users/3")
		     .then()
		     .statusCode(200);

		//System.out.println(response.asPrettyString());
		
			
		
		
	}
	
	
	
	
	
}
