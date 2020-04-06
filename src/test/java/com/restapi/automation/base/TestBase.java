package com.restapi.automation.base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class TestBase {
    public static RequestSpecification requestSpecification;

    public void initialization()
    {
        requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type","application/json");

    }


}
