class Customer {
    private int cid;
    private String cname;
    private double balance;
    private String city;
    protected static String bank = "SBI";
    
    // default constructor
    protected Customer(){
        this.cid = 0;
        this.cname = "";
        this.balance = 0;
        this.city = "";
    }
    // getting input from user with through parameter values
    protected void getter(int cid, String cname, double balance, String city){
        this.cid = cid;
        this.cname = cname;
        this.balance = balance;
        this.city = city;
    }
    // printing all bank details 
    protected void setter(){
        System.out.println("\n------------Bank Details--------------");
        System.out.println("C.ID      : "+cid);
        System.out.println("C.NAME    : "+cname);
        System.out.println("C.CITY    : "+city);
        System.out.println("C.Balance : "+balance);
        System.out.println("C.Bank    : "+bank);
        
    }
    // calculating simple interest 
    protected double CalulateSI(){
        // int t=5; double r = 8.85;
        double SI = this.balance * 5 * 8.85 / 100;
        return SI;
    }
}
class ClassicCustomer extends Customer{
    private int withdrawLimit;
    private double balance;

    // default constructor use to set withdraw limit
    protected ClassicCustomer(){
        withdrawLimit = 1000;
    }
    // take input through parameteric value
    protected void getter(int cid, String cname, double balance, String city){
        super.getter(cid, cname, balance, city);
        this.balance = balance;
    }
    // overriding function
    @Override
    protected double CalulateSI(){
        // int t=5; double r = 9.5;
        double SI = (double)this.balance * 5 * 9.5 / 100;
        return SI;
    }
    // print withdraw limit value
    protected void withdraw(){
        System.out.println("Withdraw Limit : "+withdrawLimit);
    }
}
public class Main{
    public static void main(String[] args) {
        Customer c = new Customer();
        c.getter(101, "John", 2000, "HongKong");
        c.setter();
        System.out.println("\nSimple Interest : "+c.CalulateSI());

        ClassicCustomer cc = new ClassicCustomer();
        cc.getter(111, "Ron", 23000, "KingKong");
        cc.setter();
        System.out.println("\nSimple Interest : "+cc.CalulateSI());
        cc.withdraw();
    }
}