package com.bptn.course._40_jdbc_weatherApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WeatherAppUserInsertion {

    private static final String userName = "doadmin";
    private static final String password = "AVNS_mQcCvNQDx-e7kVDyzu0";
    private static final String dbName = "weatherDB";
    private static final String port = "25060";
    private static final String dbUrl = "jdbc:postgresql://academydb-c6-s3-t4-do-user-12484302-0.j.db.ondigitalocean.com:25060/weatherDB";

    // Method to create a connection to the database
    public Connection createConnection() {
        Connection conn = null;
        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");
            // Establish a connection to the database
            conn = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return conn;
    }

    // Method to insert a new user record into the User table
    public void addUser(Connection conn, String firstName, String lastName, String username, String phone, String emailId, String password, boolean emailVerified) {
        PreparedStatement stmt = null;
        try {
            // SQL query to insert a new record into the User table
            String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            stmt = conn.prepareStatement(sql);
            
            // Set the values for the place holders
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, username);
            stmt.setString(4, phone);
            stmt.setString(5, emailId);
            stmt.setString(6, password);
            stmt.setBoolean(7, emailVerified);
            // Execute the query and get the result count
            int resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
            // Close the PreparedStatement
            stmt.close();
        } catch (SQLException ex) {
            // handle exception
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    // Method to close the database connection
    public boolean closeConnection(Connection conn) {
        boolean flag = true;
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database connection closed successfully");
            }
        } catch (SQLException ex) {
            flag = false;
            // handle exception
            System.out.println("Exception: " + ex.getMessage());
        }
        return flag;
    }
}
