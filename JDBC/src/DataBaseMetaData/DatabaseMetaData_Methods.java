import java.sql.*;
public class DatabaseMetaData_Methods {
    public static void main(String[] args)throws Exception {

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
        Statement st=con.createStatement();
        DatabaseMetaData dmd=con.getMetaData();
        System.out.println("DataBase Product Name="+dmd.getDatabaseProductName());
        System.out.println("Product Version="+dmd.getDatabaseProductVersion());
        System.out.println("Driver Name="+dmd.getDriverName());
        System.out.println("Driver Version"+dmd.getDriverVersion());
        System.out.println("User Name="+dmd.getUserName());

        String table[]={"TABLE"};
        ResultSet rs=dmd.getTables(null,null,null,table);

        while(rs.next()){
            System.out.println("\nTable Names="+rs.getString(3));
        }
    }
}
