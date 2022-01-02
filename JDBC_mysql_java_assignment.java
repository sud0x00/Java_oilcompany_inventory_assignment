import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBC_mysql_java_assignment {
   static final String DB_URL = "jdbc:mysql://localhost/inventory";
   static final String USER = "root";
   static final String PASS = "fag4lyf";
 
   public static void main(String[] args) {
 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement x= conn.createStatement();
         ResultSet rs = x.executeQuery(QUERY);
      ) {             
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO INVENTORY VALUES (1,100, 200 , 404 , 200 , 404 , 200 , 404 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (2,100, 200 , 404 , 200 , 404 , 200 , 404 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (3,100, 200 , 404 , 200 , 404 , 200 , 404 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (4,100, 200 , 404 , 200 , 404 , 200 , 404 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (5,100, 200 , 404 , 200 , 404 , 200 , 404 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (6,100, 200 , 404 , 200 , 404 , 200 , 404 )";
         x.executeUpdate(sql);
         System.out.println("Inserted records into the table...");      
         while(rs.next()){
            System.out.print("Ground nutz stock" + rs.getInt("id"));
            System.out.print("sunflower seeds stock" + rs.getInt("id"));
            System.out.print("container bags stock" + rs.getInt("id"));
            System.out.print("profit gained in the fiscal year" + rs.getInt("id"));
            System.out.print("rice stock" + rs.getInt("id"));
            System.out.print("crushing mould stock" + rs.getInt("id"));
            System.out.print("logistics vehicles stock" + rs.getInt("id"));
            System.out.print("machinery stock:" + rs.getInt("id"));
 
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
