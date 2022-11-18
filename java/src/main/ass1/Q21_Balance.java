public class Q21_Balance extends Q20_bank{
    //overriden function of Q20_bank class function
    @Override
    protected void withdraw(){
        System.out.println("\nEnter Withdrawing Amount  : ");
        int amount = s.nextInt();
        System.out.println("Amount withdrawing..................");
        if(availableBalance == 0){
            System.out.println("Available Balance is zero");
            System.out.println("Withdraw unsuccessfull.!");
        }
        else if(minimumBalance > availableBalance-amount){
            System.out.println("Withdraw unsuccessfull.");
            System.out.println("Available amount to withdraw :" + (availableBalance-minimumBalance));
        }
        else{ 
            availableBalance -= amount;
            System.out.println("Withdraw successfull.");
        }
    }
    public static void main(String[] args) {
        Q20_bank obj = new Q21_Balance();
        obj.getter();
        obj.display_account();
        
        obj.deposit();
        obj.show_balance();

        obj.withdraw();
        obj.show_balance();
    }
}
