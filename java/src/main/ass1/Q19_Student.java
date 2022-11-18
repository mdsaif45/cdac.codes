import java.util.Scanner;

public class Q19_Student {
    private int registerNumber;
    private String name;
    private int mark[]=new int[3];
    private float average ;
    private String result;
    Scanner s = new Scanner(System.in);

    //input student details
    protected void getter(){
        System.out.print("\nEnter Name        : ");
        this.name = s.nextLine();
        System.out.print("Enter Roll Number : ");
        registerNumber = s.nextInt();
        System.out.print("Enter Marks       : ");
        for(int i=0; i<3; i++)
            mark[i] = s.nextInt();
    }
    //print student details
    protected void printDetails(){
        System.out.println("\n--------------Students Details---------------");
        System.out.println("Roll Number : "+registerNumber);
        System.out.println("Name        : "+name);
        System.out.print("Marks       : ");
        for(int i=0; i<mark.length; i++)
            System.out.print(mark[i]+" ");
    }
    //print result of students
    protected void Result(){
        int sum=0, count=0;
        for(int i=0; i<mark.length; i++){
            sum += mark[i];
            if(mark[i]>49)
                count++;
        }
        average = (float)sum/mark.length;
        if(count!=3)
            result = "Fail";
        else
            result = "Pass";

        System.out.println("\n\nAverage : "+average);
        System.out.println("Result : "+result);
    }
    public static void main(String[] args) {
        Q19_Student obj = new Q19_Student();
    
        obj.getter();
        obj.printDetails();
        obj.Result();
    }
}
