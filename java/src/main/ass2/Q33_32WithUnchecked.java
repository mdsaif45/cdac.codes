import java.util.InputMismatchException;
import java.util.Scanner;

// 33. Repeat program 32 with unchecked Exception and demonstrate the difference in both program.

public class Q33_32WithUnchecked {
    public void error()throws ArrayIndexOutOfBoundsException{
        int r[] = new int[5];
        r[6] = 4;
    }
    public static void main(String[] args) throws Exception{
        Scanner s;
        try{
            s = new Scanner(System.in);
            System.out.print("\nEnter age : ");
            int age = s.nextInt();
            System.out.println(age);
            s.close();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        finally{
            Q33_32WithUnchecked e = new Q33_32WithUnchecked();
            e.error();
            
        }
    }

}
