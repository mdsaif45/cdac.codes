import java.util.Scanner;

public class Q14_numberCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the number : ");
        int num = s.nextInt();

        int count[]=new int[10], temp=num;
        while(num>0){
            int r = num%10; num/=10;
            switch(r){
                case 0: count[0]++; break;
                case 1: count[1]++; break;
                case 2: count[2]++; break;
                case 3: count[3]++; break;
                case 4: count[4]++; break;
                case 5: count[5]++; break;
                case 6: count[6]++; break;
                case 7: count[7]++; break;
                case 8: count[8]++; break;
                case 9: count[9]++; break;
                default: break;
            }
        }
        num=temp;
        int check[]=new int[10];
        while(num>0){
            int r = num%10; num/=10; 
            if(check[r] == 0){
                switch(r){
                    case 0: System.out.println("0 - "+count[0]); check[0]++; break;
                    case 1: System.out.println("1 - "+count[1]); check[1]++; break;
                    case 2: System.out.println("2 - "+count[2]); check[2]++; break;
                    case 3: System.out.println("3 - "+count[3]); check[3]++; break;
                    case 4: System.out.println("4 - "+count[4]); check[4]++; break;
                    case 5: System.out.println("5 - "+count[5]); check[5]++; break;
                    case 6: System.out.println("6 - "+count[6]); check[6]++; break;
                    case 7: System.out.println("7 - "+count[7]); check[7]++; break;
                    case 8: System.out.println("8 - "+count[8]); check[8]++; break;
                    case 9: System.out.println("9 - "+count[9]); check[9]++; break;
                    default: break;
                }
            }
        }
        
        s.close();
    }
}
