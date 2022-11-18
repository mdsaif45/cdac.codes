// Write a Java Program for Star Patterns​
// a.Square Star Pattern
// ****
// ****
// ****
// ****
// b.Triangle Star Pattern
// *
// **
// ***
// ****
// c.Inverted Pyramid
// *******
// *****
// ***
// *
import java.util.Scanner;
public class Q2_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\nEnter size of pattern : ");
        int n = s.nextInt();
        
        System.out.println("\na.Square Star Pattern : ");
        //print star pattern
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("\nb.Triangle Star Pattern : ");
        //make triangle star pattern
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("\nc.Inverted Pyramid : ");
        //make inverted pyramind
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++)
                System.out.print("* ");
            System.out.println();
        }
        s.close();

    }
}
