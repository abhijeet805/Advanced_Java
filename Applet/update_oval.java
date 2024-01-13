import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class update_oval extends Applet implements Runnable {
    
    Thread th=new Thread(this);
    Random r1=new Random();
    public void init(){
      th.start();
    }
  
  
    public void run(){
       try {
       while (true) {
         th.sleep(1000);
          repaint();
        }
       } catch (Exception e) {
        // TODO: handle exception
       }
    }

    public void update(Graphics g){
        
        int x=r1.nextInt(1000);
        int y=r1.nextInt(1000);

         g.setColor(new Color(r1.nextInt(255),r1.nextInt(100),r1.nextInt(100)));
        g.fillOval(x, y, 100, 100);
       
    }
}

/*<applet code="update_oval" width="1000" height="1000"></applet> */