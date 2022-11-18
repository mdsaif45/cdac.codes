import java.util.Scanner;

public class Q25_Mean_SD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("\nEnter the numbers : ");
        float a[] = new float[10];

        float sum=0;
        //find sum of numbers
        for(int i=0; i<5; i++){
            a[i] = s.nextFloat();
            sum+=a[i];
        }
        //find mean value
        float mean = (float)sum/a.length;
        
        sum=0;
        //caluting standard deviation
        for(int i=0; i<5; i++)
            sum+=Math.pow(a[i] - mean, 2);
        
        float f = sum/(a.length - 1);
        double sd;
        sd = Math.sqrt(f);

        //printing mean and standard deviation value
        System.out.println("The mean is : "+mean+"\nThe standard deviation is : "+sd);
        
        s.close();
    }
}
