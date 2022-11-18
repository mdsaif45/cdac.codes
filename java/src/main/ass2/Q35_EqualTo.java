
// 35.Write a program to demonstrate the use of equals method of Object class and compare its functionality with ( = = ) operator.
class Compare extends Object {
    private int num1, num2;

    public Compare(int a, int b){
        num1 = a; num2 = b;
    }
    @Override
    public boolean equals(Object o){
        Compare c = (Compare)o;
        return this.num1 == c.num1 && this.num2 == c.num2;
    }
}
public class Q35_EqualTo {
    public static void main(String[] args) {
        Compare ob1 = new Compare(4, 5);
        Compare ob2 = new Compare(4, 5);
        // compare both object refer to same location
        if(ob1 == ob2)
            System.out.println("Equal..");
        else
            System.out.println("Not equal..");
        
        // compare both object carring same data
        if(ob1.equals(ob2))
            System.out.println("Equal..");
        else
            System.out.println("Not equal..");
        
    }
}
