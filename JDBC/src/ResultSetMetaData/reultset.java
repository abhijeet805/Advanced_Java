import java.sql.*;

public class reultset {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from emp");
            ResultSetMetaData rsm=rs.getMetaData();
            System.out.println("Number of Column="+rsm.getColumnCount());
            System.out.println("Column Name="+rsm.getColumnName(2));
            System.out.println("Column Type="+rsm.getColumnTypeName(2));
            System.out.println("Size of Column="+rsm.getColumnDisplaySize(2));


        }catch(Exception e) {}
    }

}
