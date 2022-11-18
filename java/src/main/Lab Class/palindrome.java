import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = s.nextInt();

        int rev=0, temp, tens=1;
    
        temp = num;
        //checking place values
        while(num>0){
            tens*=10; num/=10; 
        }
        System.out.println(tens); 
        num = temp;
        //reversing the number
        while(num>0){
            tens/=10;
            rev += num % 10 * tens;
            num/=10;
        }
    
        //comparing reverse number with original
        if(rev == temp)
            System.out.println(rev+"is palindrome");
        else
            System.out.println(rev+"is not a palindrome");

        s.close();
           
    }
}
