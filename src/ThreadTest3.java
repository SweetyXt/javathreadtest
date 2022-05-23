class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}


public class ThreadTest3 {
    public static void main(String[] args) {
        Thread3 mythread=new Thread3();
        Thread t1=new Thread(mythread);
        t1.start();
    }


}
