// package ass1;
import java.util.Scanner;

// Write a Java program to calculate a Factorial of a number

public class Q2_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\nEnter the number : ");
        int num = s.nextInt();
        
        int temp = num, fac=1;
        //calculate factorial of given number
        while(num>0){
            fac *= num; num--; 
        }
        //print factorial value
        System.out.print("Factorial of "+temp+"   : "+fac);
        s.close();
    }
    
}
