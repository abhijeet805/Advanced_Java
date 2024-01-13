public class three_Thread extends Thread{
    int n;
    String s;
    Thread th=new Thread(); 
    three_Thread(int n,String s){
          this.s=s;
          this.n=n;
           start();
     }
     public void run(){
        try {
    
      
        for (int i = 0; i < n; i++) {
             th.sleep(1000);
            System.out.println(s);
        }
    }catch (Exception e) {
            // TODO: handle exception
        }
     }
}

class MD1{
public static void main(String args[]){
     three_Thread ob=new three_Thread(5,"Hello");
     three_Thread ob1=new three_Thread(10,"Hello Mam");
     three_Thread ob2=new three_Thread(15,"Hello Jiiii");
}
}
