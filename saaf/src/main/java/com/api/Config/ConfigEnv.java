package com.api.Config;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigEnv {


    private static final Dotenv dotenv = Dotenv.load();


    public static String get(String key) {
            return dotenv.get(key);
    }

    public static String getBaseUrl() {
        try{
        return get("BASE_URL");
        }catch(Exception e){
            throw new RuntimeException("BASE_URL is not defined in .env file");
        }
    }


    public static String getToken(){
        return get("TOKEN");
    }
    
}
