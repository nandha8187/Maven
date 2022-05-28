package com.api.deom;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.youtube.com/
		
		
		Response response = RestAssured.get("https://www.youtube.com/");
		
		int statusCode = response.statusCode();
		
		String statusLine = response.statusLine();
		
		
		System.out.println(statusCode);
		System.out.println(statusLine);
		
		
		
		
		
		
		
		
	}

}
