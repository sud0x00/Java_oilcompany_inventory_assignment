import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBC_mysql_java_assignment {
   static final String DB_URL = "jdbc:mysql://localhost/data/inventory";
   static final String USER = "root";
   static final String PASS = "toor";
 
   public static void main(String[] args) {
 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement x= conn.createStatement();
         ResultSet rs = x.executeQuery(QUERY);
      ) {             
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO INVENTORY VALUES (1,100, 310 , 404 , 124 , 1244 , 201 , 408 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (2,200, 290 , 405 , 209 , 4204 , 202 , 405 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (3,300, 270 , 406 , 202 , 4214 , 280 , 403 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (4,400, 250 , 407 , 209 , 4024 , 260 , 401 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (5,500, 230 , 408 , 205 , 1234 , 250 , 402 )";
         x.executeUpdate(sql);
         String sql = "INSERT INTO INVENTORY VALUES (6,600, 210 , 409 , 201 , 3504 , 220 , 467 )";
         x.executeUpdate(sql);
         System.out.println("Inserted records into the table...");      
         while(rs.next()){
            System.out.print("Ground nuts stock" + rs.getInt("month"));
            System.out.print("Sunflower seeds stock" + rs.getInt("ground_nuts"));
            System.out.print("Container bags stock" + rs.getInt("sunflower_seeds"));
            System.out.print("Profit gained in the fiscal year" + rs.getInt("container_bags"));
            System.out.print("Rice stock" + rs.getInt("price"));
            System.out.print("Crushing mould stock" + rs.getInt("rice"));
            System.out.print("Logistics vehicles stock" + rs.getInt("crushing mould"));
            System.out.print("Month:" + rs.getInt("logistics_vehicles")); 

      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
