import java.util.Scanner;

public class Q9_Sort {  
    //sort asending order 
    static void sortA(int a[]){
        for(int i=0; i<a.length-1; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
        for(int x: a)
            System.out.print(x+" ");
    }     
    // sort desending order
    static void sortD(int a[]){
        for(int i=0; i<a.length-1; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i]<a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
        for(int x: a)
            System.out.print(x+" ");
    }   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\nEnter size of array      : ");
        int size = s.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements in array  : ");
        
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }
        System.out.print("Sorting mode Asc=1,Des=2 : ");
        int c = s.nextInt();

        System.out.println();
        if(c == 1)
            sortA(arr);
        else
            sortD(arr);

        s.close();
    }
}
