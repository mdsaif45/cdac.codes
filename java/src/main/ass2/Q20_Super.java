// 20. Demonstrate the use of ‘super’ keyword. a) To refer to a member of super class. b) To call super class constructor from sub class constructor.

class Upper{
    int val=123;

    public Upper(){
        System.out.println("Parent class Constructor");
    }
    public void print(){
        System.out.println("Print function");
    }
}
class Lower extends Upper{
    public Lower(){
        //  super keyword use to call default constructor of parent class
        super();
    }
    public void disp(){
        // super keyword use to get data member of parent class
        System.out.println(super.val);
        // super keyword use to call member function of parent class
        super.print();
    }
   
}
public class Q20_Super {
    public static void main(String[] args) {
        Lower l = new Lower();
        l.disp();
    }
}
