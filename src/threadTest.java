import java.lang.*;
public class threadTest extends Thread{
    private int count=10;
    public void run(){
        while (true){
            System.out.print(count+" ");
            if(--count==0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        new threadTest().start();
    }
}
