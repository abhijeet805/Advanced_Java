import java.sql.*;
public class Display_first_last_previous_row {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("Select * from stud");
            rs.first();
            System.out.println("\nFirst Record");
            System.out.println("Roll No="+rs.getInt(1));
            System.out.println("Name="+rs.getString(2));
            System.out.println("Percentage="+rs.getInt(3));

            rs.last();
            System.out.println("\nLast Record");
            System.out.println("Roll No="+rs.getInt(1));
            System.out.println("Name="+rs.getString(2));
            System.out.println("Percentage="+rs.getInt(3));

            rs.previous();
            System.out.println("\nPrevious Record");
            System.out.println("Roll No="+rs.getInt(1));
            System.out.println("Name="+rs.getString(2));
            System.out.println("Percentage="+rs.getInt(3));

        }catch(Exception e){

        }
    }
}
