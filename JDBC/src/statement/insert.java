import java.sql.*;
public class insert {
    public static void main(String[] args) {
      try{
          Class.forName("org.postgresql.Driver");
          Connection con= DriverManager.
                  getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
          Statement st=con.createStatement();

          int k=st.executeUpdate("insert into stud values(101,'om',555555)");

          if(k>=1) {
              System.out.println("Record inserted");
          }
          else{
              System.out.println("Record Not inserted");
              }

          st.close();
          con.close();
      }catch(Exception e){
          System.out.println("Error="+e);
      }
    }
}

