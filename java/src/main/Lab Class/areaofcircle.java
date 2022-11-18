import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        float radius = s.nextFloat();

        float area = (float)22/7 * radius;
        System.out.println("Area of circle : "+ area);

        s.close();
    }
}
