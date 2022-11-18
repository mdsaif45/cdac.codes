import java.util.Scanner;

public class Q20_bank {
    private int accountNumber;
    private String name;
    private String accountType;
    protected int availableBalance;
    protected static int minimumBalance = 3000;
    Scanner s = new Scanner(System.in);

    //input from users account details
    protected void getter(){
        System.out.print("\nEnter Account Number  : ");
        this.accountNumber = s.nextInt(); s.nextLine();
        System.out.print("Enter Holder Name     : ");
        this.name = s.nextLine();
        System.out.print("Enter Account Type    : ");
        this.accountType = s.nextLine();
        System.out.print("Enter Account Balance : ");
        this.availableBalance = s.nextInt();
    }
    //display user account details
    protected void display_account(){
        System.out.println("\n------------Bank Details--------------");
        System.out.println("Account Number    : "+accountNumber);
        System.out.println("Name              : "+name);
        System.out.println("Account type      : "+accountType);
        System.out.println("Available balance : "+availableBalance);
    }
    //show users account balance
    protected void show_balance(){
        System.out.println("\nShowing Balance.....................");
        System.out.println("Balance Amount  : "+availableBalance);
    }
    //deposit amount to user account
    protected void deposit(){
        System.out.print("\nEnter Depositing Amount  : ");
        int amount = s.nextInt();
        availableBalance += amount;
        System.out.println("Amount depositing...................");
        System.out.println("Amount Deposit successfully..");
    }
    //withdraw amount from user account
    protected void withdraw(){
        System.out.print("\nEnter Withdrawing Amount  : ");
        int amount = s.nextInt();
        System.out.println("Amount withdrawing..................");
        if(availableBalance == 0){
            System.out.println("Available Balance is zero");
            System.out.println("Withdraw unsuccessfull.!");
        }
        else if(minimumBalance > availableBalance-amount){
            availableBalance -= amount;
            System.out.println("Withdraw successfull.");
            System.out.println("Warning : Available Balance is less than minimun amount. ");
        }
        else{ 
            availableBalance -= amount;
            System.out.println("Withdraw successfull.");
        }
    }
}
