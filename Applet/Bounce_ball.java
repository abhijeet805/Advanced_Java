import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.applet.*;

public class Bounce_ball extends Applet implements Runnable {
    Thread th;

    int i=1;
    int x=0;
    public void init(){
       th=new Thread(this);
       th.start();
      
    }

    public void run(){
      try {
        while (true) {
            x=x+20;
           if(x==1000){
            x=0;
           }
           i++;
           th.sleep(500);
           repaint();
         }
      } catch (Exception e) {
        // TODO: handle exception
      }
    }

    public void paint(Graphics g){
       Random r1=new Random();
       int r=r1.nextInt(255);
       int g1=r1.nextInt(255);
       int b=r1.nextInt(255);
       Color c1=new Color(r,g1,b);
        if(i%2==0){
            g.setColor(c1);
            g.fillOval(x,0,70,70);
        }
        else{
            g.setColor(Color.magenta);
            g.fillOval(x,300,70,70);
        }
    }
}

/*<applet code="Bounce_ball" width="1000" height="1000"> </applet>*/
