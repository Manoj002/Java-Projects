package jdbcuserinputinsert;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.sql.ResultSet;

public class JdbcUserInputInsert {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
            Statement st = conn.createStatement();
            BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        System.in
                                    )
            );
            System.out.println("Enter value 1:");
            String t1 = br.readLine();
            System.out.println("Enter value 2:");
            String t2 = br.readLine();
            boolean rs = st.execute("INSERT into t1 values("+t1+", "+t2+")");
            ResultSet rs1 = st.executeQuery("SELECT * from t1");
            while(rs1.next()) {
                int a = rs1.getInt("c1");
                int b = rs1.getInt("c2");
                System.out.println("a = " + a + " b = " + b);
            }
        } catch(SQLException ex) {
            System.out.println("SQLException");
        } catch(ClassNotFoundException cnf) {
            System.out.println("ClassNotFoundException");
        } catch(IOException ex) {
            System.out.println("IOException");
        }
    }
    
}
