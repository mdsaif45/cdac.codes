import java.util.Scanner;

// 40. Create a class Employee and encapsulate the data members
class Employee{
    private int empId;
    private int empAge;
    private String empName;
    Scanner s = new Scanner(System.in);

    public Employee(){}
    public void setData(){
        System.out.print("\nEnter Emp Id   : ");
        empId = s.nextInt();
        System.out.print("Enter Emp Age  : ");
        empAge = s.nextInt();s.nextLine();
        System.out.print("Enter Emp Name : ");
        empName = s.nextLine();
    }
    public void getData(){
        System.out.println("\nDetails------------");
        System.out.println("Emp Id   : "+empId);
        System.out.println("Emp Age  : "+empAge);
        System.out.println("Emp Name : "+empName);
    }
    public String toString(){
        return "\nEmpId   : "+empId+"\nEmpAge  : "+empAge+"\nEmpName : "+empName;
    }

}
public class Q40_Encapsulate {
        public static void main(String[] args) {
            Employee e = new Employee();

            e.setData();
            e.getData();
            // System.out.println(e);
        }
    }
    