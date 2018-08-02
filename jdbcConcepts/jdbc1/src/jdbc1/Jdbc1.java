package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to JDBC insert");
        System.out.println("Step-1: Loading the driver");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
        System.out.println("Connection established");
        Statement st = conn.createStatement();
        System.out.println("Statement created");
        System.out.println("Step-4: Inserting data");
        boolean rs = st.execute("INSERT into user values(7, 'Mayur', 'Mayur123')");
        System.out.println("Insertion complete");
    }
    
}
