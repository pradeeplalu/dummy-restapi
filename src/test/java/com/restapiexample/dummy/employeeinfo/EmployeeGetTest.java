package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeeGetTest extends TestBase {
    @Test
    public void getAllEmployee(){
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleEmployee(){

        Response response = given()
                .pathParam("id",1)
                .when()
                .get("/employee" + "/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}