// 18.Write a program to give the example for ‘this’ operator. And also use the ‘this’ keyword as return statement.

class This{
    private int number;
    // input value  for  private member
    public void inputValue(int number){
        // this keyword tells variable belongs to class
        this.number = number;
    }
    // display value of private variable 
    public void disValue(){
        // this keyword use to access to class data member
        System.out.println(this.number);
        // this keyword use to call self class member function
        this.call();
    }
    public void call(){
        System.out.println("Call function..");
    }
}
public class Q18_This{
    public static void main(String[] args) {
        This obj = new This();

        obj.inputValue(24);
        obj.disValue();
    }
}