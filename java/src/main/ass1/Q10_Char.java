import java.util.Scanner;

public class Q10_Char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the string : ");
        String str = s.nextLine();

        System.out.print("\nTask 1------\nEnter the Char : ");
        char c = s.next().charAt(0);

        int count=0;
        for(int i = 0; i<str.length(); i++)
            if(c == str.charAt(i))
                count++;
        System.out.println("character \'"+c+"\' present "+count+" times.");

        System.out.print("\nTask 2------\nEnter the Index : ");
        int index = s.nextInt();

        System.out.print("character present at "+index+" is "+(char)str.charAt(index));

        s.close();
    }
}
