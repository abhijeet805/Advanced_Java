package Prepared_Statement;

import java.sql.*;
import java.util.Scanner;

public class Accept_n_record {
    public static void main(String[] args) {
        try {

            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            PreparedStatement pst=con.prepareStatement("insert into emp1 values(?,?,?)");

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Limit=");
            int n=sc.nextInt();

            for (int i = 0; i < n; i++) {
               System.out.println("Enter eno,name,sal=");
               int eno=sc.nextInt();
               String s=sc.next();
               float sal=sc.nextFloat();

               pst.setInt(1,eno);
               pst.setString(2,s);
               pst.setFloat(3,sal);

               pst.execute();
                System.out.println("Insert Succesfully..");
            }

        } catch (Exception e) {
            System.out.println("Error="+e);
        }
    }
}
