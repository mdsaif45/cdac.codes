
// 24.Write a program to calculate the following
//     1 Find the length of array.
//     2 Demonstrate a one-dimensional array. 
//     3 Demonstrate a two-dimensional array. 
//     4 Demonstrate a multi-dimensional array.

public class Q24_Array {
    public static void main(String[] args) {
        // one-dimension array
        int a1d[] = {1, 2 , 3, 4, 5};
        // length of array
        System.out.println("\nlength of 1D array : "+a1d.length+"\n");
        // print array
        System.out.println("print 1D array : ");
        for(int i=0; i<a1d.length; i++)
            System.out.print(a1d[i] + " ");    
        System.out.println("\n");

        // two-dimension array    
        int a2d[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // print array
        System.out.println("print 2D array : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++)
                System.out.print(a2d[i][j] + " "); 
            System.out.println(); 
        }
        System.out.println();
        
        // three-dimension array
        int a3d[][][] = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        // print array
        System.out.println("print 3D array : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2; k++)
                   System.out.print(a3d[i][j][k]+ " ");
                System.out.println();   
            }  
            System.out.println();   
        }
    }
}
