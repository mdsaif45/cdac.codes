// 14. Write a program to create interface named test. In this interface the member function is square. 
//     Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use 
//     the object of arithmetic class.
interface Test{
    void square();
}
class Arithmetic implements Test{
    public void square(){
        System.out.println("\nSquare function from Arithmetic class.");
    }
}
class ToTestInt{
    ToTestInt(){}
    public void callSquare(){
        Arithmetic a = new Arithmetic();
        a.square();
    }
}
public class Q14_Interface {
    public static void main(String[] args) {
        ToTestInt obj = new ToTestInt();
        obj.callSquare();
    }
}
