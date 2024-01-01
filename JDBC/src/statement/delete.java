import java.sql.*;
public class delete {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.
                    getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            Statement st=con.createStatement();

            int k=st.executeUpdate("delete from stud where rno=101");
            if(k>=1) {
                System.out.println("Delete Succ...");
            }
            else{
                System.out.println("Record Not Found");
            }

            st.close();
            con.close();
        }catch(Exception e){
            System.out.println("Error="+e);
        }
    }
}
