class Customer{
    int aadhar;
    String name, address;

    Customer(){    aadhar = 0; }
    Customer(int aadhar, String name, String address){
        this.aadhar = aadhar;
        this.name = name;
        this.address = address;
    }
    public void getter(){
        System.out.println("\nCustomer details----");
        System.out.println("Customer aadhar  : "+aadhar);
        System.out.println("Customer name    : "+name );
        System.out.println("Customer address : "+address);
    }
}
public class Account extends Customer{
    int accNo;
    double miniBal=1000, currBal;
    Account(){}
    Account(int accNo, double currBal){
        this.accNo = accNo;
        this.currBal = currBal;
    }
    public void getter(){
        System.out.println("\nCustomer Account details----");
        System.out.println("Account Number    : "+accNo);
        System.out.println("Available balance : "+ currBal );
    }

    // withdraw amount 
    public void withdraw(double amount) throws NegetiveBalanceException{
        System.out.println("\nWithdrawing in proccess.");
        if(this.currBal<amount){
                try {
                    throw new NegetiveBalanceException("Account Error: Insufficient Balance.."); 
                } catch (Exception e) {
                    System.out.println(e);
                }   
        }else{
            System.out.println("Withdraw Successfull.");
            this.currBal -= amount;
            System.out.println("Available Balance : "+currBal);
        }
    }

    // calculate interest value on current balance
    public void calculateInterest(){
        System.out.println("\n Interest : "+(5*8.5+currBal/100));
    }
    
    public static void main(String[] args) throws NegetiveBalanceException{
        Customer c1 = new Customer(12345, "Bob", "Delhi");
        Account a1 = new Account(11111, 2000);
        // getting Cutomer details
        c1.getter();
        a1.getter();
        // withdrawing amount from acount balance
        a1.withdraw(200);
        a1.withdraw(2100);
        // getting interest value on current balance
        a1.calculateInterest();

    }
}

// user defined exception for negetive Balance
class NegetiveBalanceException extends Exception{
    static String s;
    public NegetiveBalanceException(String err){
        s = err;
    }
    public String toString(){
        return s;
    }
}

