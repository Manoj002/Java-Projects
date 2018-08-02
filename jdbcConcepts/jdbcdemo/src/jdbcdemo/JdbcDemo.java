package jdbcdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

    public static void main(String[] args) throws IOException {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
        Statement st = conn.createStatement();
        BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                            System.in
                                    )
        );
        System.out.println("Enter u_id");
        String s0 = br.readLine();
        System.out.println("Enter u_name");
        String s1 = br.readLine();
        System.out.println("pwd");
        String s2 = br.readLine();
        boolean rs = st.execute("INSERT into user values('s0', 's1', 's2')");
        ResultSet r = st.executeQuery("SELECT * from user");
        while(r.next()) {
            int a = r.getInt("u_id");
            String b = r.getString("u_name");
            String c = r.getString("pwd");
            System.out.println("u_id = " + a + " u_name = " + b + " pwd = " + c);
        }
        System.out.println("Insert successfull");
        } catch(SQLException ex) {
            System.out.println(ex);
        } catch(ClassNotFoundException cnf) {
            System.out.println("class not found");
        }
        
    }
}
