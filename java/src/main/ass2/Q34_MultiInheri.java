// 34. Write a program to give example for multiple inheritance in Java.
interface A{
    public void display();

    default void call(){
        System.out.println("Default A");
    }
}
interface B{
    public void display();

    default void call(){
        System.out.println("Default B");
    }
}
public class Q34_MultiInheri implements A, B{
    public void display(){
        System.out.println("Hello display...");
        call();
    }
    public void call(){
        A.super.call();
        B.super.call();
    }
    public static void main(String[] args) {
        Q34_MultiInheri o = new Q34_MultiInheri();
        o.display();
    }
}
