package dao;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msms?useSSL=false","root","pass");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}