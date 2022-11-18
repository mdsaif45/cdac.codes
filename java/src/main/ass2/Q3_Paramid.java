// Write a Java program to Print Right Triangle Number Pattern
// Type
// 34890
// 476
// 34
// 1
// package ass2;
import java.util.Scanner;
 
public class Q3_Paramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter size of pattern : ");
        int n = s.nextInt();
        //make triangle of random number
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++)
        //         System.out.print((int)(Math.random()*10));
        //     System.out.println();
        // }
        int size = n*(n+1)/2;
        // System.out.println(size);
        for(int i=n; i>0; i--){
            if(i%2 == 0){
                for(int j=0; j<i; j++)
                    System.out.print(size--);
            }
            else{
                size -= i-1;
                for(int j=0; j<i; j++)
                    System.out.print(size++);
                size -= i+1;
            }
            
            System.out.println();
        }
            s.close();
    }
    
}
