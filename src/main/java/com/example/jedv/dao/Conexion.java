package com.example.jedv.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection() {
        String url = "jdbc:postgresql://localhost/jedvconsultorysystem";
        String user = "postgres";
        String password = "malp2014";
        try {
            System.out.println("Database Connected!");
            return DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no connection to the database");
            return null;
        }
    }
}
