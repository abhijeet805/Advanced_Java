package Prepared_Statement;
import java.sql.*;
public class PST {
    public static void main(String[] args)throws Exception {
         Class.forName("org.postgresql.Driver");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
         PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");

         pst.setInt(1,101);
         pst.setString(2,"OM");
         pst.setFloat(3,50004);

        pst.executeUpdate();pst.executeUpdate();pst.executeUpdate();
         int k=pst.executeUpdate();
         if(k>=1){
             System.out.println("Insert succ.........");
         }
         pst.close();
         con.close();

    }
}