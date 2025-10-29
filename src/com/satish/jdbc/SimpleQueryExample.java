package com.satish.jdbc;

import java.sql.*;

public class SimpleQueryExample {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        // 1) Try-with-resources ensures resources are closed automatically
        try (Connection conn = DriverManager.getConnection(url, user, pass);  // establish connection
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, username, email, created_at FROM users")) {
            // 2) Iterate result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");

                String email = rs.getString("email");
                Timestamp created = rs.getTimestamp("created_at");
                System.out.printf("%d %s %s at %s\n", id, username, email, created);
            }
        }
    }
}