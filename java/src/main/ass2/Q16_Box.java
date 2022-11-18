
// 16.Create class box and box3d. box3d is extended class of box. 
// The above two classes going to pull fill following requirement 
// a)Include constructor. 
// b)set value of length, breadth, height 
// c)Find out area and volume.
import java.util.Scanner;

class Box{
    private double l, b, h;
    public Box(){   l=b=h=0; }
    public Box(double l, double b, double h){
        this.l = l; this.b = b; this.h = h;
        // System.out.printf("%.2f %.2f %.2f", l, b, h);
    }
    public double area(){return 0;}
    public double volume(){return 0;}
}
class Box3d extends Box{
    private double l, b, h;
    public Box3d(){ l=b=h=0; }
    public Box3d(double l, double b, double h){
        this.l = l; this.b = b; this.h = h;
    }
    public double area(){
        return 2*l*b + 2*b*h + 2*l*h;
    }
    public double volume(){
        return l*b*h;
    }
}
public class Q16_Box {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter dimension of box (l, b, h): ");
        double l = s.nextDouble(); double b = s.nextDouble(); 
        double h = s.nextDouble();

        Box box = new Box3d(l, b, h);
        // Box bx = new Box(4, 5, 6);
        System.out.println("\nArea of box : "+ box.area());
        System.out.println("Volume of box : "+ box.volume());

        s.close();
    }
}
