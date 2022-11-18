import java.util.Scanner;

// Write a Java code to get a number and find whether it is prime number or not.
// (note:Prime number is the number divisible by 1 and itself only)

public class Q5_Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, count=0;

        System.out.print("\nEnter the number : ");
        num = s.nextInt();
        
        //find prime number
        for(int i = 1; i < num; i++)
            if(num % i == 0)
                count++;
        
        if(count == 1)
            System.out.print(num + " is prime number.");
        else
            System.out.print(num + " is not prime number.");

        s.close();
    }
}