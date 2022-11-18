import java.util.Scanner;

public class Q11_LinearS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter size of array     : ");
        int size = s.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements in array : ");
        
        for(int i = 0; i<size; i++)
            arr[i] = s.nextInt();
        
        System.out.print("Enter the search key    : ");
        int key = s.nextInt();

        int count=0;
        //linear search
        for(int i = 0; i<size; i++)
            if(key == arr[i]){
                count++;
                System.out.print("Search found at index "+i);
            }
            
        if(count==0)
            System.out.print("\nSearch Not found..");
                
        s.close();
    }
}
