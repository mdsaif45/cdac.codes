// Write a program to Check if the given string is Palindrome or not .
import java.util.Scanner;
public class Q4_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the number : ");
        int num = s.nextInt();
        int parlindrome = 0, temp = num, count = 1;
        //count place value of number
        while(num>0){
            num/=10; count *= 10;
        }
        num = temp;
        //revering the number
        while(num>0){
            count/=10;
            parlindrome += num%10 * count; num/=10;  
        }
        //comparing input no. with reverse no. 
        if( temp == parlindrome ) 
            System.out.println("Number is parlindrome");    
        else
        System.out.println("Number is not parlindrome");
        
        s.close();
    }
}
