package Prepared_Statement;
import java.sql.*;
import java.util.Scanner;

public class update {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            PreparedStatement pst=con.prepareStatement("update emp1 set name=?, sal=? where eno=?");

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter eno,name,sal=");
            int eno=sc.nextInt();
            String s=sc.next();
            float sal=sc.nextFloat();

                pst.setString(1,s);
                pst.setFloat(2,sal);
                pst.setInt(3,eno);

                pst.execute();
                System.out.println("Update Succesfully..");
            }catch(Exception e) {
              System.out.println("Error="+e);
             }
    }
}

