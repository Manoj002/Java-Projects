package jdbcupdate;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JdbcUpdate {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdata", "root", "root");
            System.out.println("user before update...");
            showTable(conn, "user");
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE user set u_name = 'Bhavna' where u_id = 7");
            System.out.println("user after update....");
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
            System.out.println("Statement created");
            ResultSet rs = st.executeQuery("SELECT * from " + table_name);
            /*while(rs.next()) {  //Alternate
                int i = rs.getInt("u_id");
                String j = rs.getString("u_name");
                String k = rs.getString("pwd");
                System.out.println("u_id = " + i + " u_name = " + j + " pwd = " + k);
            }*/
            ResultSetMetaData rsmd = rs.getMetaData();
            for(int count = 1 ; count<=rsmd.getColumnCount();count++)
            {
                System.out.println(rsmd.getColumnName(count)+"\t");
            }
            System.out.println("");
            while(rs.next())
            {
                for(int count = 1 ; count<=rsmd.getColumnCount();count++)
                {
                    System.out.print(rs.getObject(count)+"\t");
                }
                System.out.println("");
            }
        } catch(SQLException ex) {
            System.out.println("SQLException");
        }
    }
}
