import javax.swing.*;
public class JTable_1 extends JFrame {
    JTable tbl;
    JTable_1(){
         setVisible(true);
         setSize(500,500);
         setLayout(null);
         String head[]={"rno","Name","Per"};
         String records[][]={
                 {"101","om","77"},
                 {"102","sai","88"},
                 {"103","ram","99"}
         };

         tbl=new JTable(records,head);
         JScrollPane jsp=new JScrollPane(tbl);
         jsp.setBounds(20,20,300,400);
         add(jsp);
    }
    public static void main(String args[]){
        new JTable_1();
    }
}
