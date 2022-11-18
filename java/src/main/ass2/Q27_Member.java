import java.util.Scanner;

class Member{
    String name;
    int age;
    int phoneNumber;
    String address;
    int salary;

    public void printSalary(){
        System.out.println("salary : "+salary);
    }
}
class Employee extends Member{
    Scanner s = new Scanner(System.in);
    String specialization, department;
    public Employee(){
        
        System.out.println("\nEnter Employee Details ------------");
        System.out.print("Enter Name    : ");   name = s.nextLine();
        System.err.print("Enter Age     : ");   age  = s.nextInt();
        System.out.print("Enter Contact : ");   phoneNumber = s.nextInt();s.nextLine();
        System.out.print("Enter Address : ");   address = s.nextLine();
        System.out.print("Enter Salary  : ");   salary = s.nextInt();s.nextLine();
        System.out.print("Enter Specialization : ");   specialization = s.nextLine();
        System.out.print("Enter Department     : ");   department = s.nextLine();

    }
    public void printDetails(){
        System.out.println("\n>> Employee Details ------------");
        System.out.println("   Name    : "+name);
        System.err.println("   Age     : "+age);
        System.out.println("   Contact : "+phoneNumber);
        System.out.println("   Address : "+address);
        System.out.println("   Salary  : "+salary);
        System.out.println("   Specialization : "+specialization);
        System.out.println("   department     : "+department);
    }
}
class Manger extends Member{
    Scanner s = new Scanner(System.in);
    String specialization, department;
    public Manger(){
        
        System.out.println("\nEnter Manager Details ------------");
        System.out.print("Enter Name    : ");   name = s.nextLine();
        System.err.print("Enter Age     : ");   age  = s.nextInt();
        System.out.print("Enter Contact : ");   phoneNumber = s.nextInt();s.nextLine();
        System.out.print("Enter Address : ");   address = s.nextLine();
        System.out.print("Enter Salary  : ");   salary = s.nextInt();s.nextLine();
        System.out.print("Enter Specialization : ");   specialization = s.nextLine();
        System.out.print("Enter Department     : ");   department = s.nextLine();

    }
    public void printDetails(){
        System.out.println("\n>> Manger Details ------------");
        System.out.println("   Name    : "+name);
        System.err.println("   Age     : "+age);
        System.out.println("   Contact : "+phoneNumber);
        System.out.println("   Address : "+address);
        System.out.println("   Salary  : "+salary);
        System.out.println("   Specialization : "+specialization);
        System.out.println("   department     : "+department);
    }
}
public class Q27_Member {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manger m = new Manger();
        e.printDetails();
        // e.printSalary();
        m.printDetails();  
    }   
}
