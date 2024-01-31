import javax.swing.*;
import java.util.*;

class demo extends JFrame{
    demo(){
        setVisible(true);
        setLayout(null);
                      
        Vector head=new Vector();
        head.add("Rno");
        head.add("Name");
        head.add("per");

        Vector records=new Vector();
        
        Vector row1=new Vector();
        row1.add("11");
        row1.add("om");
        row1.add("66.77");

        Vector row2=new Vector();
        row2.add("11");
        row2.add("om");
        row2.add("66.77");

        Vector row3=new Vector();
        row3.add("11");
        row3.add("om");
        row3.add("66.77");

        records.add(row1);
        records.add(row2);
        records.add(row3);

       JTable tbl=new JTable(records,head);
       JScrollPane jsp=new JScrollPane(tbl);
       jsp.setBounds(10,10,300,300);
       add(jsp);
    }
    public static void main(String[] args) {
        new demo();
    }
}