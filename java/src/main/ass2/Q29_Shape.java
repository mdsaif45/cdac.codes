abstract class Shape{
    abstract void rectangleArea(float l, float b);
    abstract void squareArea(float side);
    abstract void circleArea(float radius);
}
class Area{
    void rectangleArea(float l, float b){
        System.out.println("\nArea of rectangle : "+ (l * b));
    }
    void squareArea(float side){
        System.out.println("Area of Square    : "+ (side * side));
    }
    void circleArea(float radius){
        System.out.printf("Area of Circle    : %.2f", (Math.PI * radius * radius));
    }
}
public class Q29_Shape {
    public static void main(String[] args) {
        Area a = new Area();

        a.rectangleArea(3, 5);
        a.squareArea(4);
        a.circleArea(7);
    }
}
