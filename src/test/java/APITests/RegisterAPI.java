package APITests;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RegisterAPI {
    @Test
    public void register(){

    Faker faker=new Faker();
    Map<String, String > reqister = new HashMap<>();
    reqister.put("email", faker.internet().emailAddress());
    reqister.put("plainPassword","Hh1!1hjvuihk");
    reqister.put("firstName","test");
    reqister.put("middleName","deneme");
    reqister.put("lastName","lasttest");
    reqister.put("lat","123abc");
    reqister.put("lng","123abcd");
    reqister.put("zipCode","12345");
    Response response = given().
            contentType(ContentType.JSON).
            when().
            body(reqister).
            post("https://test.urbanicfarm.com/api/public/register");
    response.prettyPrint();

    response.
            then().
            assertThat().
            statusCode(200).
            contentType(ContentType.JSON);

    JsonPath jsonPath = response.jsonPath();
    SoftAssert softAsser = new SoftAssert();
    softAsser.assertEquals(jsonPath.getBoolean("success"),true);
    softAsser.assertEquals(jsonPath.getString("email"),"atbcefsdeneme@gmail.com");
    softAsser.assertEquals(jsonPath.getString("plainPassword"),"Hh1!kkkkkkkkk");
    softAsser.assertEquals(jsonPath.getString("first_name"),"test");
    softAsser.assertEquals(jsonPath.getString("first_middle"),"deneme");
    softAsser.assertEquals(jsonPath.getString("first_lastname"),"lasttest");

}}