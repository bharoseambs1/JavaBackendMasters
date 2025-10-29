package com.satish.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CreateEmployee {
    public static void main(String[] args) {

        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

        try {
            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Sachin");
            ps.setString(2, "IT");
            ps.setDouble(3, 70000.00);

            int rows = ps.executeUpdate();

            System.out.println(rows + " employee(s) inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}