// 12.Write a program to give the example for method overriding concepts.
class upper{
    public void display(){
        System.out.println("\nInside upperclass : display()");
    }
}
public class Q12_Overiding extends upper{
    @Override
    public void display(){
        System.out.println("\nInside lowerclass : display() overriden");
    }
    public static void main(String[] args) {
        Q12_Overiding q = new Q12_Overiding();
        // call overriden method
        q.display();
        q.getClass();
    }
}
