import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class AWT_insert_record extends Frame implements ActionListener {

    TextField t1,t2,t3,t4,t5,t6;
    Button b1,b2,b3;
    Label l1,l2,l3,l4,l5,l6;
    Connection con; Statement st;
    AWT_insert_record() {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        l1=new Label("Enter Rno");
        l2=new Label("Enter Name");
        l3=new Label("Java");
        l4=new Label("PHP");
        l5=new Label("DS");


        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        t5=new TextField(10);


        b1=new Button("save");
        b2=new Button("Search");

        add(l1);add(t1);add(l2);add(t2);
        add(l3);add(t3);add(l4);add(t4);
        add(l5);add(t5);add(b1);add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        try{
            Class.forName("org.postgresql.Driver");
             con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
             st=con.createStatement();

        }catch(Exception e){
            System.out.println("Error="+e);
        }

    }
    public void actionPerformed(ActionEvent ae){
        //Save Values in Table
        if(ae.getSource()==b1){
            int rno=Integer.parseInt(t1.getText());
            String sname=t2.getText();
            int Java=Integer.parseInt(t3.getText());
            int php=Integer.parseInt(t4.getText());
            int DS=Integer.parseInt(t5.getText());
            try {
                st.executeUpdate("insert into stud1 values(" + rno + ",'" + sname + "'," + Java + "," + php + "," + DS + ")");
            }
            catch (Exception e){
                System.out.println("Error="+e);
             }
            }

        //Search Values in Table
        if(ae.getSource()==b2){
           int rno=Integer.parseInt(t1.getText());

            try {
                    ResultSet rs=st.executeQuery("select * from stud1 where rno="+rno+"");
                    if(rs.next()){
                        t2.setText(rs.getString(2));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t5.setText(rs.getString(5));

                    }
                    rs.close();
                    st.close();
                    con.close();
            }
            catch (Exception e){
                System.out.println("Error="+e);
            }

        }
    }
    public static void main(String[] args) {
    new AWT_insert_record();
    }

}
