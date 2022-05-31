package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeeDeleteTest extends TestBase {
    @Test
    public void deleteEmployee(){
        Response response =  given()
                .header("Authorization","Bearer b5f2ee3fca5b4efacce265745546d4fd7f1501611b151cf408ac45f7648bb5d0")
                .pathParam("id",2)
                .when()
                .delete("/delete"+"/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}


