//Calculates the sum of multiples of 3 from 3 to 2100000000.
class MultipleOf3  implements Runnable {
    private volatile int sum = 0;

    public void run() {
        int counter = 1;
        for(int i = 3; i < 100; i += 3) {

          //If the multiple of 3 ends with a 5 or 0, then skip it because
           // it is a multiple of 5.
          if(counter == 5) {
                counter = 1;
                continue;
           }

           sum += i;
           counter++;
        }
    }

   public int getSum() {
       return sum;
   }
}
// Calculates the sum of multiples of 5 from 5 to 2100000000.

class MultipleOf5  implements Runnable {
    private volatile int sum = 0;

    public void run() {
         //This time we added all multiples of 5 - including the 
        //values that were skipped that were multiples of 3 and 5
        for(int i = 5; i < 100; i += 5) {
           sum += i;
        }
    }

    public int getSum() {
        return sum;
    }

}
public class Threads {
    private static int parallelSolution() throws InterruptedException{
        int totalSum = 0;

        MultipleOf3 multipleOf3 = new MultipleOf3();
        Thread newThread = new Thread(multipleOf3);

        MultipleOf5 multipleOf5 = new MultipleOf5();
        Thread secondThread = new Thread(multipleOf5);

        newThread.start();
        secondThread.start();

        newThread.join();
        secondThread.join();

        totalSum += multipleOf3.getSum();
        totalSum += multipleOf5.getSum();

         return totalSum;
   }


    public static void main(String[] args) throws InterruptedException  {
        long startTime = System.currentTimeMillis();    
        int sum = parallelSolution();   
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("The total sum = " + sum);
        System.out.println("Elapsed time is " + elapsedTime);
    }

}
