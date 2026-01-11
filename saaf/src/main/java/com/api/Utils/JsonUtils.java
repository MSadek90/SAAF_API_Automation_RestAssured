package com.api.Utils;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();





    //Deserlaization
    public static <T> T toObject(Response response, Class<T> tClass) {
        return response.as(tClass);
    }


    
    //Serlaization
    public static <T> T fromJson(String filePath, Class<T> clazz) {
        try {
            return mapper.readValue(new File(filePath), clazz);
        } catch (Exception e) {
            throw new RuntimeException(
                "Failed to read json file: " + filePath, e);
        }
    }
}


