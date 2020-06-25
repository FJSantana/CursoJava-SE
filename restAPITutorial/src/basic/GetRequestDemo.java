package basic;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
//import org.hamcrest.Matcher;
//import io.restassured.response.Response;

public class GetRequestDemo {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1/employees";
    }

    @Test
    public void statusCodeVerification(){
        given()
                .param("employee_name", "Tiger Nixon")

        .when()
                .get("json")

        .then()
                .statusCode(200);
    }
}
