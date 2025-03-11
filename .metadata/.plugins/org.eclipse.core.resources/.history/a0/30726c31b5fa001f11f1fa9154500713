package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Change as per your DB
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}