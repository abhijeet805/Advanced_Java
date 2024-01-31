import java.sql.*;
public class DisplayTablesName {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
            Statement st=con.createStatement();
            DatabaseMetaData dmd=con.getMetaData();
            String table[]={"TABLE"};
            ResultSet rs=dmd.getTables(null,null,null,table);

            while(rs.next()){
                System.out.println("Table Name="+rs.getString(3));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
