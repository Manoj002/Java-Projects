package jdbc;

import java.sql.*;

public class Jdbc {

    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to JDBC!");
        System.out.println("Step-1: Loading the driver");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
        System.out.println("Establishing connection");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
        System.out.println("Connection established");
        Statement st = conn.createStatement();
        System.out.println("Statement created");
        System.out.println("Step-4: Executing Query and obtaining results");
        ResultSet rs = st.executeQuery("SELECT * from user");
        System.out.println("Result Set obtained");
        while(rs.next()) {
            int i = rs.getInt("u_id");
            String n = rs.getString("u_name");
            String p = rs.getString("pwd");
            System.out.println("u_id = " + i + " u_name = " + n + " pwd = " + p);
        }
    }
    
}
