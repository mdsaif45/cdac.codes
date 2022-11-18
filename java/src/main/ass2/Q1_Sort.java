import java.util.Scanner;

public class Q1_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input size of array
        System.out.print("\nEnter the size of array : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        //input elements for array
        System.out.print("Enter elements of array : ");
        for(int i=0; i<size; i++)
            arr[i] = s.nextInt();
        //sorting array
        for(int i=0; i<size-1; i++)
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        //printing sorted array
        System.out.print("\nSorted array (ascending order) : ");           
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");

        s.close();
    }
}

