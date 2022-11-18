// 42.Access/invoke protected members/methods of a class outside the package.
import pkg.A;

public class Q42_Protected {
    public static void main(String[] args) {
        A a = new A();
        // display() is not visible to this class 
        // display() has protected access in A
        // a.display();  // this gives error

        // callDisplay() is public. so, it is visible to this class and to all class which will import this class
        // by using other public function to call display() can be possible
        a.callDisplay();        // callDisplay() calls display()

    }
}
