// 11. Create multiple threads using anonymous inner classes.

public class Q11_MultiThread {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

  
    }
}
