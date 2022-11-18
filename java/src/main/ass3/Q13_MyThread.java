// 13.Write a program to create a class MyThread in this class a constructor, call the base class constructor,
//    using super and starts the thread. The run method of the class starts after this. It
//    can be observed that both main thread and created child thread are executed concurrently.
class BaseThread extends Thread{
    BaseThread(){
        this.start();
    }
    public void run(){
        try {
            for(int i=0; i<5; i++){
                System.out.print(i+" ");
                Thread.sleep(900);
            }
        } catch (Exception e) {
            System.err.println("Exiting main thread...");
        }
    }
}
class MyThread extends BaseThread {
    MyThread(){
        super();
    }
    public void run(){
        try {
            for(int i=5; i<10; i++){
                System.out.print(i+" ");
                Thread.sleep(900);
            }
        } catch (Exception e) {
            System.err.println("Exiting child thread...");
        }
    }
}
public class Q13_MyThread{
    public static void main(String[] args) {
        try {
            // new BaseThread();
            new MyThread();
        } catch (Exception e) {
            System.err.println("Thead activating fail..");
        }
    }
} 