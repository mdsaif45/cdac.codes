// Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
// The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for
// multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on

class Q4_CozaLoza{
    public static void main(String args[]){

        for(int i=1; i<=110; i++){
            if(i%3 == 0 && i%5 == 0)
                System.out.print("CozaLoza ");

            else if(i%3 == 0 && i%7 == 0)
                System.out.print("CozaWoza ");

            else if(i%5 == 0 && i%7 == 0)
                System.out.print("LozaWoza ");

            else if(i%3 == 0)
                System.out.print("Coza ");

            else if(i%5 == 0)
                System.out.print("Loza ");

            else if(i%7 == 0)
                System.out.print("Woza ");

            else System.out.print(i + " ");

            //make new line after every 11 number
            if(i%11 == 0)
                System.out.println();

        }
        System.out.println();
    }
}

