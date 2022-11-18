package pkg;

public class A{
    public A(){
        System.out.println("Default constructor : A");
    }
    protected void display(){
        System.out.println("protected fucntion");
    }
    public void callDisplay(){
        display();
    }
}