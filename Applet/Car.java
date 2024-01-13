import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;


public class Car extends Applet implements Runnable{
    
    Thread th=new Thread(this);

    public void init(){
         th.start();

    }

    public void run(){
        try {
            while (true) {
                th.sleep(100);
                repaint();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
 int x=30,x1=365;

 int y=300;

    public void paint(Graphics g){
        if(x1>1910){
          x=30;x1=365;
        }
        g.setColor(Color.cyan);
        g.fillRect(x,120,420, 200);
        g.fillRect(x+420,180,130, 140);
        
        g.fillOval(x, y, 70, 70);
        g.fillOval(x1, y, 70, 70);
        x+=10;x1+=10;
    }
}


/*<applet code="Car.java" width="1928" height="1000"></applet> */