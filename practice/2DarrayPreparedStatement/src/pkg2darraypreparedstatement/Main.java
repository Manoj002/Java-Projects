package pkg2darraypreparedstatement;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        int c1 = 0;
        int c2 = 0;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
            System.out.println("Conneection established");
            String str = "INSERT into t1 values(?,?)";
            PreparedStatement st = conn.prepareStatement(str);
            System.out.println("Query");
            int input[][] = new int[10][2];
            for(int i = 0; i < input.length; i++) {
                input[i][0] = i * 10 + i;
                input[i][1] = i * 10 + i;
            }
            System.out.println("Array");
            for(int temp []: input) {
                c1 = temp[0];
                st.setInt(1, c1);
                c2 = temp[1];
                st.setInt(2, c2);
                System.out.println("Completed");
                st.execute();
            }
            ResultSet rs = st.executeQuery("SELECT * from t1");
            while(rs.next()) {
                int i = rs.getInt("c1");
                int j = rs.getInt("c2");
                System.out.println("c1 = " + i + " c2 = " + j);
            }
        } catch(ClassNotFoundException cnf) {
            System.out.println("ClassNotFoundException");
        } catch(SQLException ex) {
            System.out.println("SQLException");
        }
    }
    
}
