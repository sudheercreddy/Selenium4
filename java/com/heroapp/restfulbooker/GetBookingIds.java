package com.heroapp.restfulbooker;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBookingIds {
	
	@Test
	public void GetBookingIdsa() {
		
		// get the list of booking ID
		Response res = RestAssured.get("https://restful-booker.herokuapp.com/booking");
		res.print();
		
		//Verify the status code
		Assert.assertEquals(res.getStatusCode(), 200,"Expected status code is 200 but it is 201");
		System.out.println(res.getStatusCode());
		
		//verify atleast 1 booking id is not empty
		
		 List<Integer> listofbooking = res.jsonPath().getList("bookingid");
		 Assert.assertFalse(listofbooking.isEmpty(),"list of booking id are empty ,but it should having booking ID's");
		 
		 for(Integer aa: listofbooking) {
			 System.out.println(aa+ ": - Booking ID");
		 }
	}

}
