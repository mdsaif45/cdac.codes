import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an alphabet : ");
        char c = s.next().charAt(0);

        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
           c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println("Vowel");
        else
            System.out.println("Consonants");

        s.close();
    }
}
