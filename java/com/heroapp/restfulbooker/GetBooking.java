package com.heroapp.restfulbooker;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBooking {

	@Test
	public void getbookingM() {
		Response res = RestAssured.get("https://restful-booker.herokuapp.com/booking/5");
		res.print();

		System.out.println(res.statusCode());

		/*
		 * {"firstname":"Sally","lastname":"Smith","totalprice":623,"depositpaid":false,
		 * "bookingdates":{"checkin":"2016-11-08","checkout":"2021-07-13"},
		 * "additionalneeds":"Breakfast"}
		 */
		
		  SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(res.jsonPath().getString("firstname"), "Eric","Expected firstname is not true");
		 
		 softAssert.assertEquals(res.jsonPath().getString("lastname"), "Smith","Expected firstname is not true");
		 
		 softAssert.assertEquals(res.jsonPath().getInt("totalprice"), 631,"Expected firstname is not true");
		 
		 softAssert.assertEquals(res.jsonPath().getString("depositpaid"), "true","Expected firstname is not true");
		 softAssert.assertAll();
	}

}
