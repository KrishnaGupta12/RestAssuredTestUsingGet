package org.example;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

/*
    given() :-  set cookies,add auth,add param,set header info etc
    when()  :-  get,post,put,delete
    than()  :-  validating status code,extract response,extact header cookies and response body

    */
public class Test_Get_Request {

    @Test
    public void getUserDetails()
    {
        given()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                    .statusCode(200)
                    .assertThat()
                    .body("first_name", equalTo("Janet"))
                        .header("content-type","application/json; charset=utf-8");

    }
}
