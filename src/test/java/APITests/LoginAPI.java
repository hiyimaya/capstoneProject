package APITests;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginAPI {
    @Test
    public void login(){
    Map<String, String > reqBody = new HashMap<>();
    reqBody.put("email","alfredstehr@mailsac.com");
    reqBody.put("password","A/b123456");
    Response response = given().
            contentType(ContentType.JSON).
            when().
            body(reqBody).
            post("https://test.urbanicfarm.com/api/public/login");
    response.prettyPrint();

    response.
            then().
            assertThat().
            statusCode(200).
            contentType(ContentType.JSON);

    JsonPath jsonPath = response.jsonPath();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(jsonPath.getBoolean("success"),true);
    softAssert.assertEquals(jsonPath.getString("first_name"),"alfred");
    softAssert.assertEquals(jsonPath.getString("first_lastname"),"stehr");
    softAssert.assertEquals(jsonPath.getString("email"),"alfredstehr@mailsac.com");
    softAssert.assertAll();

}






}

