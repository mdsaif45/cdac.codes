import java.io.*;
import java.util.*;

class MultipleOf3 extends Thread{
    private ArrayList<Integer> list3 = new ArrayList<Integer>();
    public void run(){
        for(int i=3; i<100; i++){
            // as question asked multiple of 3 and 7 
            // the list will empty because there is zero
            // common multiple of 3, 5, 7 between 0-100
            
            // if(i%3 == 0 && i%7 == 0)
            //     list3.add(i);
            
            // this only check multiple of 3
            if(i%3 == 0)
                list3.add(i);
        }       
    }
    ArrayList<Integer> getList(){
        return list3;
    };
}
class MultipleOf5 extends Thread{
    private ArrayList<Integer> list5 = new ArrayList<Integer>();
    public void run(){
        // check multiple of 5
        for(int i=5; i<100; i++){
            if(i%5 == 0)
                list5.add(i);
        }
    }
    ArrayList<Integer> getList(){
        return list5;
    };
}

public class Mutliple {

    public final static void main(String[] args) throws Exception {
        MultipleOf3 m3 = new MultipleOf3();
        MultipleOf5 m5 = new MultipleOf5();
        // Multiple m = new Multiple();

        m3.start();
        m5.start();
        m3.join(); m5.join();
        
        // reading list from thread class
        List<Integer> l3 = m3.getList();
        List<Integer> l5 = m5.getList();
        // printing list of number whihc is multiple of 3
        System.out.println("\nMultiple of 3 :\n"+l3);
        // printing list of number whihc is multiple of 5
        System.out.println("\nMultiple of 5 :\n"+l5);
        // finding common elements in the list
        l3.retainAll(l5);
        // displaying list of numbers which is multiple of 3 and 5
        System.out.println("\nCommon elements :\n"+l3);
        
    } 

}
