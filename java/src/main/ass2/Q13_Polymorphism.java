// 13.Write a program to create a class named shape. 
// In this class we have three sub classes circle, triangle and square 
// each class has two member function named draw () and erase (). 
// Create these using polymorphism concepts.
class Shape{
    void draw(){
        System.out.println("\nDraw Shape...");
    }
    void erase(){
        System.out.println("\nErase Shape...");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("\nDraw Circle...");
    }
    @Override
    void erase(){
        System.out.println("\nErase Circle...");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Triangle...");
    }
    @Override
    void erase(){
        System.out.println("Erase Triangle...");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Square...");
    }
    @Override
    void erase(){
        System.out.println("Erase Square...");
    }
}
public class Q13_Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();      
        Shape circle = new Circle();
        circle.draw();
        Shape triangle = new Triangle();
        triangle.draw();
        Shape square = new Square();
        square.draw();

        shape.erase();
        circle.erase();    
        triangle.erase();
        square.erase();
    }
}
