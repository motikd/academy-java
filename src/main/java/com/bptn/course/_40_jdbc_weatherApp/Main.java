package com.bptn.course._40_jdbc_weatherApp;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        WeatherAppUserInsertion jdbc = new WeatherAppUserInsertion();
        Connection conn = jdbc.createConnection();

        // Insert a new user record into the User table
        jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);

        // Close the database connection
        jdbc.closeConnection(conn);
    }
}
