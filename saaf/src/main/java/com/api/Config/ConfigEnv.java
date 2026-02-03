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
        try{
            return get("TOKEN");
        }catch(Exception e){
            throw new RuntimeException("TOKEN is not defined in .env file");
        }
    }



    public static String getDbUrl() {
        try {
            return get("dbURL");
        } catch (Exception e) {
            throw new RuntimeException("dbURL is not defined in .env file");
        }
    }



    public static String getDbUser() {
        try {
            return get("dbUser");
        } catch (Exception e) {
            throw new RuntimeException("dbUser is not defined in .env file");
        }
    }


    
    public static String getDbPassword() {
        try {
            return get("dbPassword");
        } catch (Exception e) {
            throw new RuntimeException("dbPassword is not defined in .env file");
        }
    }

}
