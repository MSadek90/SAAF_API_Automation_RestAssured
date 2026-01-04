package com.api.Utils;



import com.fasterxml.jackson.databind.ObjectMapper;

public class UnicodeUtils {


    private static final ObjectMapper mapper = new ObjectMapper();

    public static String decodeUnicode(String json) {
        try {
            Object obj = mapper.readValue(json, Object.class);
            return mapper.writerWithDefaultPrettyPrinter()
                         .writeValueAsString(obj);
        } catch (Exception e) {
            return json;
        }
    }

}
