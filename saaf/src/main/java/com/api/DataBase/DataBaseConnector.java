package com.api.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import com.api.Config.ConfigEnv;

public class DataBaseConnector {
    public static Connection connectToDatabase() {

        Connection con = null;
        String dbUrl = ConfigEnv.getDbUrl();
        String dbUser = ConfigEnv.getDbUser();
        String dbPassword = ConfigEnv.getDbPassword();

        try {
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;

    }

}
