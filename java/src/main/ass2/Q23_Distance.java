import java.util.Scanner;

// 23. Define a class of type Distance that has Feet and Inches as members. 
//      -Define a function that adds two Distances passed as argument and returns the sum as another Distance object
class Distance{
    double feet, inches;

    Distance(){ feet=inches=0; }
    public Distance sumDistance(double d1, double d2){
        Distance d = new Distance();
        d.feet = d1 + d2;
        d.inches = d.feet * 12;
        return d;
    }
    public String toString(){
        return "Feet   : "+String.format("%.2f", feet)+"\nInches : "+String.format("%.2f", inches);
    }
}
public class Q23_Distance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter two distance in feet : ");
        double d1 = s.nextDouble(); double d2 = s.nextDouble();
        
        Distance d = new Distance();
        System.out.println("\nSum of distance in ");
        System.out.println(d.sumDistance(d1, d2));

        s.close();
    }
}
