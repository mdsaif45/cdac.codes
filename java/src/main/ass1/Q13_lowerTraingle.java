import java.util.Scanner;

public class Q13_lowerTraingle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the no. of row in  matrix...");
        int r= s.nextInt();

        System.out.println("Enter the no. of cols in matrix...");
        int c = s.nextInt();

        System.out.println("Enter the elements in the matrix...");
        int a[][] = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                a[i][j] = s.nextInt();
         
        System.out.println("Matrix entered by the user...");
        //input matrix
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("Lower triangular Matrix:");
        // print lower triangle matrix
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(j>i){
                    System.out.print("0 "); continue;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
