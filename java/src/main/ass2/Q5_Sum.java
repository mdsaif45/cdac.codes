// Write a JAVA program for computing sum of two integers
// and floats using abstract classes.
import java.util.Scanner;

abstract class sum{
    public abstract void sumInt(int a, int b);
    public abstract void sumFloat(float a, float b);
}
public class Q5_Sum extends sum {
    //eval sum of integer and print value
    public void sumInt(int a, int b){
        System.out.println("Sum of integer : "+(a+b));
    }
    //eval sum of float and print value
    public void sumFloat(float a, float b){
        System.out.println("\nSum of float   : "+(a+b));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter two number : ");
        float a = s.nextFloat(); float b = s.nextFloat(); 

        Q5_Sum obj = new Q5_Sum();
        obj.sumFloat(a, b);
        obj.sumInt((int)a, (int)b);

        s.close();
    }
}
