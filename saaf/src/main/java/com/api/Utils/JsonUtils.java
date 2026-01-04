package com.api.Utils;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();




    
    public static <T> T fromJson(String filePath, Class<T> clazz) {
        try {
            return mapper.readValue(new File(filePath), clazz);
        } catch (Exception e) {
            throw new RuntimeException(
                "Failed to read json file: " + filePath, e);
        }
    }
}


