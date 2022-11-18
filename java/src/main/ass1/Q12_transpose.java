import java.util.Scanner;

public class Q12_transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     
        System.out.println("\nEnter the 3X3 Matrix : ");
        int arr[][] = new int[3][3];
        for(int i =0 ; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr[i][j] = s.nextInt();

        //Transpose Matrix
        System.out.println("\nTranspose Matrix : ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

        s.close();
    }
}
