
// Design a Java program to get a number from user and find the given 
// number is positive or negative. Display the message.
import java.util.Scanner;

public class Q1_Positive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("\nEnter the number : ");
        num = s.nextInt();

        //Check for positive
        if (num > 0)        System.out.println(num+" is positive number.\n");
        //check for negative
        else if(num < 0)    System.out.println(num+" is negetive number.\n");
        //left will be zero
        else                System.out.println("Number is zero.\n");
        s.close();
    }
}
