package com.travellazy;

import org.junit.Test;

import java.io.IOException;

import static com.jayway.restassured.path.json.JsonPath.with;
import static junit.framework.TestCase.assertTrue;

/**
 * Unit test for simple App.
 */

public class AppTest
{
    @Test
     public void checkRfqSubmitMissingEmailOnly() throws IOException
     {
         String JSON = ResourceFileHelper.getJsonContent("errorNoEmailSingleRfqResponse.json");

         String expectedMessage = ResourceFileHelper.getJsonContent("missingEmail.json");

         assertTrue(with(JSON).get("listError[0]").equals(expectedMessage));
 //                .body("listError[0]", equalTo(expectedMessage))
 //                .given()
 //                .contentType("application/json")
 //                .body(jsonToFire)
 //                .post("/rfq/submit");
     }

}
