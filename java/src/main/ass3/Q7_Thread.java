// 7. . Create multiple threads using Thread class and Runnable interfaces.

class A extends Thread{
    public void run(){
        try {
            for(int i=0; i<10; i++){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
class B implements Runnable{
    public void run(){
        try {
            for(int i=50; i<60; i++){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
public class Q7_Thread {
    public static void main(String[] args) {
        A t1 = new A();
        Thread t2 = new Thread(new B());

        t1.start();
        t2.start();
    }
}
