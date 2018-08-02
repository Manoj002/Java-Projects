package jdbcreadselect;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class JdbcReadSelect {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from t1");
            ResultSetMetaData rsmd = rs.getMetaData();
            for(int count = 1 ; count<=rsmd.getColumnCount();count++)
            {
                System.out.print(rsmd.getColumnName(count)+"\t");
            }
            while(rs.next()) {
                for(int count = 1 ; count<=rsmd.getColumnCount();count++)
                {
                    System.out.println(rs.getObject(count));
                }
            }
        } catch(ClassNotFoundException cnf) {
            System.out.println("ClassNotFoundException");
        } catch(SQLException ex) {
            System.out.println("SQLException");
        }
    }
    
}
