import java.util.Scanner;

// 26. Write a user-defined function to find the sum of an array passed as argument.
//     -Write a program that declares an array of 10 elements and uses this function to
//     a) Find the sum of all elements.
//     b) Find the sum of first 5 elements.
//     c) Find the sum of last 5 elements.

public class Q26_SumArr {
    public int sumAll(int[] args, int f, int l){
        int sum = 0;
        for(int i = f; i < l; i++)
            sum += args[i];
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q26_SumArr s = new Q26_SumArr();
        int arr[] = new int[10];

        System.out.println("\nEnter the 10 element for array : ");
        for(int i=0; i<10; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("\nthe sum of all elements     : "+s.sumAll(arr, 0, 10));
        System.out.println("the sum of first 5 elements : "+s.sumAll(arr, 0, 5));
        System.out.println("the sum of last 5 elements  : "+s.sumAll(arr, 5, 10));

        in.close();
    }
    
}
