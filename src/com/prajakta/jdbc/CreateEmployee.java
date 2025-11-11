package com.prajakta.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateEmployee {
    public static void main(String[] args) {

        String sql = "INSERT INTO employee (empno, firstname, midinit, lastname, workdept) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,   2);
            ps.setString(2, "Naresh");
            ps.setString(3, "H");
            ps.setString(4, "Jadhav");
            ps.setString( 5,"mgr");

            int rows = ps.executeUpdate();

            System.out.println(rows + " employee(s) inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
