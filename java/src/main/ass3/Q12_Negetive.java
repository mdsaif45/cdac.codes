// 12.Write a program for example of try and catch block. In this
//    check whether the given array size is negative or not

public class Q12_Negetive {
    public static void main(String[] args) {
        try {
            int arr[] = new int[-1];
            System.out.println(arr.length);
        } 
        catch (NegativeArraySizeException e) {
            System.err.println(e);
            System.out.println("The given array size is negative");
        }
    }
}
