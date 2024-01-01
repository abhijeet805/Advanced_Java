import java.sql.*;
import java.util.Scanner;

public class insert_multiple {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            Statement st=con.createStatement();
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Limit:");
            int n=sc.nextInt();
            int k=0;
            for (int i = 0; i < n; i++) {

                System.out.println("Enter Rno,name,per");
                int rno = sc.nextInt();
                String name = sc.next();
                float per = sc.nextFloat();
                k=st.executeUpdate("insert into stud values("+rno+",'"+name+"',"+per+")");

            }
            if(k>=1)
                 System.out.println("Inserted_succ");
            else
                System.out.println("Inserted_unsucc");

            st.close();
            con.close();

        }catch(Exception e){
            System.out.println("Error="+e);
        }
    }
}
