/*
 * package AlersJS;
 * 
 * import io.restassured.RestAssured; import io.restassured.path.json.JsonPath;
 * import reqresnin.JsonBody;
 * 
 * import static io.restassured.RestAssured.*; import static
 * org.hamcrest.Matchers.*;
 * 
 * public class resExample { static String res = RestAssured.baseURI =
 * "https://reqres.in";
 * 
 * public static void main(String[] args) { //getReq(); postReq(); }
 * 
 * private static void getReq() {
 * 
 * String getResponse = given().log().all().queryParam("page",
 * "2").when().log().all().get(res + "/api/users")
 * .then().extract().response().asString();
 * System.out.println("getResponse**********" + getResponse);
 * 
 * JsonPath js = new JsonPath(getResponse); int aa = js.get("page");
 * System.out.println(aa); }
 * 
 * private static void postReq() { String postRes =
 * given().log().all().body(JsonBody.postrequestBody())
 * .when().post(res+"/api/users")
 * .then().log().all().assertThat().statusCode(201).header("Content-Type",
 * equalTo("application/json; charset=utf-8")) .extract().response()
 * .asString(); JsonPath js = new JsonPath(postRes); String postName =
 * js.get("id"); System.out.println("postName********"+postName);
 * 
 * } }
 */