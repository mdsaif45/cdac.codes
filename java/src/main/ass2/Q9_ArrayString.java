// Write a program to print the array as a string.

import java.util.Scanner;
public class Q9_ArrayString {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.print("\nEnter 3 words : ");
        String str[] = new String[3];
        
        for(int i=0; i<str.length; i++)
            str[i] = s.next();
        
            // print array of string
        System.out.print("Print string  : ");
        for(int i=0; i<str.length; i++)
            System.out.print(str[i]+" ");
        
            s.close();
    }
}
