import java.util.Scanner;

public class Q22_Demo {
    //find largest and smallest number in array
    void largeSmallNum(int a[]){
        int small=a[0], large = a[0];
        for(int i=0; i<a.length; i++){
            if(small > a[i])
                small = a[i];
            if(large < a[i])
                large = a[i];
        }
        System.out.println("\nsmallest number : "+small);
        System.out.println("largest number  : "+large);
    }
    //find odd and even in array
    void oddEven(int a[]){
        for(int i=0; i<a.length; i++){
            if(a[i]%2 == 0)
                System.out.print("\neven : "+a[i]);
            else
                System.out.print("\nodd  : "+a[i]);
        }
    }
    //find negetive and positive number in array
    void negPos(int a[]){
        System.out.println("\n");
        for(int i=0; i<a.length; i++){
            if(a[i] == 0)
                System.out.println(a[i]+" is zero number.");
            else if(a[i] > 0)
                System.out.println(a[i]+" is positive number");
            else
                System.out.println(a[i]+" is negative number");
        }
    }
    //find sum and average in array
    void sumAvg(int a[]){
        double sum=0, avg=0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        avg = sum/a.length;

        System.out.println("\nSum : "+sum+"\nAvg : "+avg);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the 5 number : ");
        int arr[] = new int[5];
        for(int i=0; i<5; i++)
            arr[i] = s.nextInt();
        
        Q22_Demo obj1 = new Q22_Demo();
        obj1.largeSmallNum(arr);
        
        Q22_Demo obj2 = new Q22_Demo();
        obj2.oddEven(arr);
        
        Q22_Demo obj3 = new Q22_Demo();
        obj3.negPos(arr);
        obj3.sumAvg(arr);

        s.close();
    }
}
