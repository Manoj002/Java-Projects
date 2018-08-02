package jdbcpreparedst;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcPreparedSt {

    public static void main(String[] args)throws Exception {
        System.out.println("Welcome to JDBC-prepared Statement example");
        System.out.println("Step-1: Loading the driver");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        System.out.println("Establishing connection");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
        System.out.println("Connection established");
        String str = "INSERT into user values(?,?,?)";
        PreparedStatement st = conn.prepareStatement(str);
        System.out.println("Statement created");
        st.setInt(1, 8);
        st.setString(2, "Shailu");
        st.setString(3, "Shailu123");
        st.execute();
        System.out.println("Value inserted");
    }
    
}
