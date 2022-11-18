// Write Java code statements that accomplish the tasks listed below
// a) Declare an array of integers.
// b) Allocate storage to allow 5 integers to be stored in the array.
// c) Populate the array with the values: 1, 8, 27, 64, 125
// d) Replace the third array element with the value -7.
// e) Copy the value of the fifth array element to the first array storage location.
// f) Subtract the value stored in the second array storage location from the value stored in the
// third and store the difference in the fourth array storage location.
// g) Compute the sum of the array elements with subscripts 1 to 3

public class Q8_Array {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 8, 27, 64, 125};
        // arr[] =  {1, 8, 27, 64, 125};
        arr[2] = -7;
        arr[0] = arr[4];
        arr[3] = arr[1] - arr[2];
        
        int sum=0;
        for(int x = 1; x <= 3; x++){
            sum += arr[x];
        }
        for(int x: arr)
            System.out.print(x+" ");

        System.out.println("\nSum(1, 3) : "+sum);     
        
    }
}
