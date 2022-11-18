// 11.Write a program to demonstrate static variables, methods, and blocks.

public class Q11_Static {
    // static data membeer
    // this is class member, visibility through out the class 
    static int var = 8;
    
    // static block
    // this block get called initaially
    static{
        System.out.println("\nInside static block.");
        System.out.println("Calling static method..");
        method();
    }
    // static member function
    // this method can be called without any creation of object
    static void method(){
        System.out.println("\nInside static method "+var);
    } 
    public static void main(String[] args) {
        System.out.println("\nMain method..");
    }
}
