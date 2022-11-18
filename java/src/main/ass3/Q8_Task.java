// 8. Assign same task and different task to multiple threads.

class Task1 extends Thread {
    public void run(){
        try {
            System.out.println("Multiple of 3 ");
            for(int i=1; i<10; i++){
                System.out.println("3 * "+i+" = "+3*i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }  
}
class Task2 extends Thread {
    public void run(){
        try {
            System.out.println("Multiple of 5 ");
            for(int i=1; i<10; i++){
                System.out.println("5 * "+i+" = "+5*i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
public class Q8_Task {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();
    }
}
