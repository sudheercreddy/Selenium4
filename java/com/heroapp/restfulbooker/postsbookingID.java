package com.heroapp.restfulbooker;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postsbookingID {

	@Test
	public void createBookingID() {

		Response res = createBooking();
		res.print();

		Assert.assertEquals(res.getStatusCode(), 200);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(res.jsonPath().getString("booking.firstname"), "sudheer",
				"Expected firstname is not true");

		softAssert.assertEquals(res.jsonPath().getString("booking.lastname"), "kumar",
				"Expected firstname is not true");

		softAssert.assertEquals(res.jsonPath().getInt("booking.totalprice"), 150, "Expected firstname is not true");

		softAssert.assertEquals(res.jsonPath().getString("booking.depositpaid"), "true",
				"Expected firstname is not true");
		softAssert.assertEquals(res.jsonPath().getString("booking.additionalneeds"), "Biryai",
				"Expected firstname is not true");
		softAssert.assertEquals(res.jsonPath().getString("booking.bookingdates.checkin"), "2024-01-01",
				"Expected firstname is not true");
		softAssert.assertEquals(res.jsonPath().getString("booking.bookingdates.checkout"), "2024-01-01",
				"Expected firstname is not true");

		softAssert.assertAll();
	}

	private Response createBooking() {
		JSONObject body = new JSONObject();
		body.put("firstname", "sudheer");
		body.put("lastname", "kumar");
		body.put("totalprice", 150);
		body.put("depositpaid", "true");

		JSONObject bookingdates = new JSONObject();
		bookingdates.put("checkin", "2024-01-01");
		bookingdates.put("checkout", "2024-01-01");
		body.put("bookingdates", bookingdates);
		body.put("additionalneeds", "Biryai");

		Response res = RestAssured.given().contentType(ContentType.JSON).body(body.toString())
				.post("https://restful-booker.herokuapp.com/booking");
		return res;
	}

}
