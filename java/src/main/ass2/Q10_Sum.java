import java.util.Scanner;

// Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. 
// The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; 
// otherwise it should terminate.

public class Q10_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        do{
            System.out.print("\nEnter two Number : ");
            int num1 = s.nextInt(); int num2 = s.nextInt();
            
            System.out.println("Sum of Numbers   : "+(num1 + num2));
            
            System.out.print("\nWish to perform again....press y : ");
            char ch = s.next().charAt(0);
            
            if(ch != 'y'){
                System.out.print("Exiting..."); break;  
            } 
        }while(true);

        s.close();
    }
}
