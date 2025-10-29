package com.satish.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateEmployee {

    public static void main(String[] args) {

        String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDouble(1, 85000.00);
            ps.setInt(2, 2);

            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}