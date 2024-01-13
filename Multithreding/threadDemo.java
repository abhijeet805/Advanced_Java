import java.awt.*;
import java.awt.event.*;
class TDEMO extends Frame implements ActionListener,Runnable
{
    Thread th=new Thread(this);
    TextField t1;
    Button b1,b2;


    TDEMO(){

     setVisible(true);
     setSize(500,500);
     setLayout(new FlowLayout());
     b1=new Button("Resume");
     b2=new Button("Suspend");
     t1=new TextField(10);
     add(t1);add(b1);add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);

    th.start();
    }

    public void actionPerformed(ActionEvent ae){

         if (ae.getSource()==b1){
                th.notify();
         }

        if (ae.getSource()==b1){
          th.wait();
        }

    }
    public void run(){
        try {

         int i=0;
         while(true){
             th.sleep(1000);
              t1.setText(""+i);
              i++;
         }
        }catch (Exception e){}
    }
    public static void main(String[] args) {
        new TDEMO();
    }
}
