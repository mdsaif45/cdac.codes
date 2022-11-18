import java.util.Random;
import java.util.Scanner;

public class Q23_Random {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int ran = rand.nextInt(100);

        System.out.print("\nEnter the number : ");
        int num = s.nextInt();

        if(ran-10 < num && num < ran+10)
            System.out.println("Number is too low");
        else 
            System.out.println("Number is too high");
        
        s.close();
    }
}
