
// 19.write a program To find the sum of command line arguments and count the invalid integers entered.

public class Q19_Count {
    public static void main(String[] args) {
        int sum=0, invalidCount=0;

        for(int i=0; i<args.length; i++){
            try {
                System.out.print(args[i]+" ");
                sum += Integer.parseInt(args[i]);
            } catch (Exception e) {
                invalidCount++;
                // System.out.println(e);    // java.lang.NumberFormatException
            }
        }

        System.out.println("\nsum of command line : "+ sum);
        System.out.println("no. of invalid integer : "+ invalidCount);
    }
}
