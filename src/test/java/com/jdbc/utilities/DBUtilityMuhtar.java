package com.jdbc.utilities;


import java.sql.*;

public class DBUtilityMuhtar {
    private final static String username = ConfigurationReader.getProperty("JDBC_Username"),
            password = ConfigurationReader.getProperty("JDBC_Password"),
            URL = ConfigurationReader.getProperty("JDBC_URL");
    private static Connection connection;
    private static Statement statement;
    public static DatabaseMetaData metaData;

   /* public int getCount() {
        synchronized (this) {
            return count;
        }
    }*/


    static {
        try {
            connection = DriverManager.getConnection(URL, username, password);
            statement = connection.createStatement();
            metaData = connection.getMetaData();
        } catch (Exception e) {
        }
    }

    public static ResultSet getResult(String sql) {
        //creates the result
        //when you declare a variable within the method or block => you can only use that variable in that block.
        //so we declared resultSet variable outside try block.
        ResultSet result = null;
        try {
            result = statement.executeQuery(sql);
        } catch (Exception e) {
        }
        return result;
    }

    public static void tearDown() {
        //closes the connection at the last step
        try {
            connection.close();
        } catch (Exception e) {
        }
    }

}