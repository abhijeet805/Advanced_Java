import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Traffic extends Applet implements Runnable{
    
    Thread th;
    Button b1,b2;
    int i=0;

   
   public void init(){
    
      th=new Thread(this);
      th.start();
       
   }
   public void run(){
      try {
          while (true) {
            i++;
            th.sleep(2000);
             repaint();
          }
      } catch (Exception e) {
        
      }
   }

public void paint(Graphics g){
    g.setColor(Color.BLACK);
    g.drawRect(30, 70,100, 300);
     
    if(i==1){
        g.setColor(Color.red);
        g.fillOval(50, 100, 50, 50);
        
    }
    
    if(i==2){
        g.setColor(Color.yellow );
        g.fillOval(50, 160, 50, 50);
      

    }
    if(i==3){
        g.setColor(Color.green);
      g.fillOval(50,260,50,50);
      i=0;
    }


}
   
}
/*<applet code="Traffic" width="800" height="800"></applet> */