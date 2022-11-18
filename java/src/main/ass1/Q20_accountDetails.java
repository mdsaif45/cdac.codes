public class Q20_accountDetails {
    public static void main(String[] args) {
        Q20_bank obj = new Q20_bank();
        
        obj.getter();
        obj.display_account();
        
        obj.deposit();
        obj.show_balance();

        obj.withdraw();
        obj.show_balance();
    }
}
