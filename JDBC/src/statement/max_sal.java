package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class max_sal {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select * from emp1 where sal=(select max(sal) from emp1)");

            while(rs.next()){
                System.out.println("Emp no="+rs.getInt(1));
                System.out.println("name="+rs.getString(2));
                System.out.println("Salary="+rs.getFloat(3));
            }
        }catch(Exception e){
            System.out.println("Error="+e);
        }
    }
}


