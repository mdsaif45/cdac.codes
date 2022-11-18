import java.util.Scanner;

public class Q24_duplicate {
    //calculate duplicate digit
    static long duplicateDigits(long n){
        long t = n, r, num=n;
        int c=0;
        while(t>0){
            t/=10;
            c++;
            n *= 10;
        }
        t = num;
        long tens=1;
        for(int i=1; i<=c; i++){
            r = t%10;
            n += r * tens; 
            tens *= 10;
            t /= 10;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the number : ");
        long num = s.nextLong();

        System.out.println(duplicateDigits(num));

        s.close();
    }
}
