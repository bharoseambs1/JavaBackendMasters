package com.satish.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {

    public static void main(String[] args) {

        String sql = "DELETE FROM employees WHERE id = ?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, 2);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}