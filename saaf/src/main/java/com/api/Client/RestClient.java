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
                    .baseUri(ConfigEnv.getBaseUrl())
                    .header("Authorization", "Bearer " + ConfigEnv.getToken()).log().all();
   }



    public static Response post(String Endpoint,Object body){
        log.info("POST request to {}", Endpoint);
        return baseRequest()
        .body(body)
        .when()
        .post(Endpoint);
    }

    public static Response postWithId(String Endpoint, Object body, String Key_name, int Key_value){
        log.info("[Post] request to {}", Endpoint);
        return baseRequest()
        .body(body)
        .pathParam(Key_name,Key_value)
        .when()
        .post(Endpoint);

    }


    public static Response put(String Endpoint, String key_name, int Key_value){
         log.info("Put request to {}", Endpoint);
        return baseRequest()
        .pathParam(key_name,Key_value)
        .when()
        .put(Endpoint);
    }

    public static Response get(String Endpoint, String key_name, int Key_value){
        log.info("Get request to {}", Endpoint);
        return baseRequest()
        .pathParam(key_name,Key_value)
        .when()
        .get(Endpoint);
    }

}
