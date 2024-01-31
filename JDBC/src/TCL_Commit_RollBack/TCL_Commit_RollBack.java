import java.sql.*;
import java.util.Scanner;

public class TCL_Commit_RollBack {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
            Statement st=con.createStatement();

            con.setAutoCommit(false); //Important Method
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter rno to Delete=");
            int no=sc.nextInt();

            int k=st.executeUpdate("Delete from stud where rno="+no);
            if(k>=1) {
                System.out.println("Delete Succesful");

                System.out.println("Are you sure to delete Record YES/NO");
                String input = sc.next();

                    if (input.equals("YES")) {
                        con.commit();
                        System.out.println("Commit Succesfully");
                    }
                    else {
                        con.rollback();
                        System.out.println("RollBack Succesfully");
                    }
            }
            else{
                System.out.println("Record Not Found");
            }
        }catch(Exception e){

        }
    }
}
