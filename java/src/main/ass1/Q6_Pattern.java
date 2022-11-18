// Design a Java program to print the following pattern for the positive value ‘n’.
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
import java.util.Scanner;

public class Q6_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("\nEnter the number : ");
        num = s.nextInt();

        for(int i = 0; i < num; i++){
            //create requird space
            for(int j=num-i ; j>0; j--)
                System.out.print(" ");
            //print stars
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            //give next line
            System.out.println();
        }

        s.close();
    }       
}
