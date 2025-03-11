package com.example.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class First {
    public static void main(String[] args) {
        
        String url = "jdbc:oracle:thin:@localhost:1521:xe";  
        String user = "system";  
        String password = "admin"; 
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle Database!");


            Statement stmt = conn.createStatement();


            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("----------------------");
            }

            
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
