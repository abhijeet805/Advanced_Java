import java.util .*;
class TDemo implements Runnable{
    Thread th;
    int i,no,sum;
    int a[]=new int[1000];
   

    TDemo(int n){
        th=new Thread(this);
       Random r1=new Random();
       int j=0;
       no=n;
       System.out.println(n);
       for(i=n;i<=n+100;i++){
             a[i]=r1.nextInt(100);
                 
       }    
       th.start();
    }

    public void run(){
      
        for (int i = 0; i < 100; i++) {
             sum+=a[no];
             no++;
        }
        System.out.println("Sum="+sum);
        System.out.println("Average="+sum/100);
    }
  public static void main(String args[])throws Exception{
      TDemo t[]=new TDemo[10];
      
    
    
      TDemo t1=new TDemo(100);
      t1.th.join();
      TDemo t3=new TDemo(200);
      t3.th.join();
      TDemo t4=new TDemo(300);
      t4.th.join();
      TDemo t5=new TDemo(400);
      t5.th.join();
      TDemo t6=new TDemo(500);
      t6.th.join();


      

      //    for (int i = 1; i < 1000; i=i+100) {
    //       t[i]=new TDemo(i);
    //       t[i].th.join();
    //    }
    
  }
}

