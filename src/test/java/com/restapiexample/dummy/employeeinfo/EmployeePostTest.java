package com.restapiexample.dummy.employeeinfo;


import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class EmployeePostTest extends TestBase {
    @Test
    public void createEmployeeData(){
        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName("NameTest");
        employeePojo.setSalary("1111");
        employeePojo.setAge("44");
        employeePojo.setId("25");

        Response response = given()
                .body(employeePojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}