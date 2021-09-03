package com.bookit.utilities;

import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.*;

import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public abstract class BookitTestBase {

    static String token = ConfigurationReader.getProperty("token");

    @BeforeAll
    public static void init(){

        baseURI = ConfigurationReader.getProperty("qa3api.url");

    }

    @AfterAll
    public static void destroy(){

    }



}
