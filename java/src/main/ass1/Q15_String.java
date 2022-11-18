import java.util.Scanner;

public class Q15_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the String : ");
        String str = s.nextLine();
        int size = str.length()/5;
        String st[] = new String[5];

        // dividing string into 5 equal parts
        for(int i=0, k=0; i < str.length()+1; i++){
            if(i%size == 0 && i!=0){
                st[k] = str.substring(i-size, i);
                k++;
            }
        }
        //printing divided parts of string
        for(int i=0; i<5; i++)
            System.out.println(st[i]);
        s.close();
    }   
}
