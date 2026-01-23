package com.api.Client;


import com.api.Utils.Logging;
import org.slf4j.Logger;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import com.api.Config.ConfigEnv;


public class RestClient {




    
    private static final Logger log =
            Logging.getLogger(RestClient.class);


   private static RequestSpecification baseRequest(){
      return (RequestSpecification) given().accept(ContentType.JSON).contentType(ContentType.JSON)
                    .baseUri(ConfigEnv.getBaseUrl());
                    //.header("Authorization", "Bearer " + ConfigEnv.getToken()).log().all();
   }



    public static Response post(String Endpoint,Object body){

        try {
            log.info("POST request to {}", Endpoint);
            return baseRequest()
            .body(body)
            .when()
            .post(Endpoint);
        } catch (Exception e) {
            log.error("Error occurred while sending POST request to {}: {}", Endpoint, e.getMessage());
            throw e;
        }
    }

    public static Response postWithId(String Endpoint, Object body, String Key_name, int Key_value){
        log.info("[Post] request to {}", Endpoint);
        try {
            return baseRequest()
            .body(body)
            .pathParam(Key_name,Key_value)
            .when()
            .post(Endpoint);
        } catch (Exception e) {
            log.error("Error occurred while sending POST request to {}: {}", Endpoint, e.getMessage());
            throw e;
        }

    }


    public static Response put(String Endpoint, String key_name, int Key_value){
         log.info("Put request to {}", Endpoint);
        try {
            return baseRequest()
            .pathParam(key_name,Key_value)
            .when()
            .put(Endpoint);
        } catch (Exception e) {
            log.error("Error occurred while sending PUT request to {}: {}", Endpoint, e.getMessage());
            throw e;
        }
    }

    public static Response show(String Endpoint, String key_name, int Key_value, String token){
        log.info("Get request to {}", Endpoint);
        try {
            return baseRequest()
            .header("Authorization", "Bearer " + token)
            .pathParam(key_name,Key_value)
            .when()
            .get(Endpoint);
        } catch (Exception e) {
            log.error("Error occurred while sending GET request to {}: {}", Endpoint, e.getMessage());
            throw e;
        }
    }

    public static Response show(String Endpoint, String key_name, int Key_value){
        log.info("Get request to {}", Endpoint);
        try {
            return baseRequest()
            .pathParam(key_name,Key_value)
            .when()
            .get(Endpoint);
        } catch (Exception e) {
            log.error("Error occurred while sending GET request to {}: {}", Endpoint, e.getMessage());
            throw e;
        }
    }




    public static Response list(String Endpoint){
        try {
            log.info("Get request to {}", Endpoint);
            return baseRequest()
            .when()
            .get(Endpoint);
        } catch (Exception e) {
            log.error("Error occurred while sending GET request to {}: {}", Endpoint, e.getMessage());
            throw e;
        }
    }

}
