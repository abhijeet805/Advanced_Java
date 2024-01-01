import java.sql.*;
public class Resultset {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from stud");

            while(rs.next()){
                System.out.println("Rno="+rs.getInt(1));
                System.out.println("Name="+rs.getString(2));
                System.out.println("Per="+rs.getFloat(3));
            }
            rs.close();
            st.close();
            con.close();
        }catch(Exception e){
            System.out.println("Error="+e);
        }
    }
}
