package Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            PreparedStatement pst=con.prepareStatement("delete from emp1 where eno=?");

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter eno to deleted record=");
            int eno=sc.nextInt();

            pst.setInt(1,eno);

            pst.execute();
            System.out.println("deleted Succesfully..");
        }catch(Exception e) {
            System.out.println("Error="+e);
        }
    }
}


