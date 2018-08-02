package jdbcdelete;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JdbcDelete {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
            Statement st = conn.createStatement();
            System.out.println("user before delete...");
            showTable(conn, "user");
            boolean rs = st.execute("DELETE from user where u_name = 'Bhavna'");
            System.out.println("user after delete...");
            showTable(conn, "user");
        } catch(ClassNotFoundException cnf) {
            System.out.println("ClassNotFoundException");
        } catch(SQLException ex) {
            System.out.println("SQLException");
        }
    }
    
    static void showTable(Connection conn, String table_name) {
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from " + table_name);
            ResultSetMetaData rsmd = rs.getMetaData();
            for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnName(i)+"\t" );
            }
            System.out.println("");
            while(rs.next()) {
                for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getObject(i)+ "\t");
                }
                System.out.println("");
            }
        } catch(SQLException ex) {
            System.out.println("SQLException");
        }
    }
}
