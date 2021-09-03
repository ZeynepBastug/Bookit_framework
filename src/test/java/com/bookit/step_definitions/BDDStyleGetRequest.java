package com.bookit.step_definitions;

import com.bookit.utilities.BookitTestBase;
import com.bookit.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class BDDStyleGetRequest extends BookitTestBase {

    @Test
    public void test() {

        given().header("Authorization", ConfigurationReader.getProperty("token")).accept(ContentType.JSON)
                .and().pathParam("campus_location","VA")
                .log().all().when().get("/api/campuses/{campus_location}")
        .then().statusCode(200).body("id", is(1));
    }

    public static void main(String[] args) {
         BookitTestBase.getAllCampuses();
    }

}
