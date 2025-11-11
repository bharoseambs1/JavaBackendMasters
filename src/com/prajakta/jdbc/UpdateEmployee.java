package com.prajakta.jdbc;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {

    public static void main(String[] args) {

        String sql = "UPDATE employee SET workdept = ? WHERE empno = ?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,"mgr" );
            ps.setInt(2, 4);

            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}