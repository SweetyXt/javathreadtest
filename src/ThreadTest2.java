class thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class thread3 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<200;i++){
            System.out.println("hello");
        }
    }
}


public class ThreadTest2 {
    public static void main(String[] args) {
        thread2 th=new thread2();
        thread3 th2=new thread3();
        th.start();
        th2.start();
    }
}
