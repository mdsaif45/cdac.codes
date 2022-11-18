// 22. Modify program 21 to define a parametrized constructor and finalizer in each class. 
//     Demonstrate calling the constructor of the base class from the constructor of the derived class. 
//     -Create objects of person and employee classes to show the order of invocation of constructors.

class Person{
    private String name, DOB, address;
    public Person(){
        System.out.println("Person Constructor");
    }
    public Person(String name, String DOB, String address){
        this.name = name; 
        this.DOB = DOB; 
        this.address = address;
    }
    public void getData(){
        System.out.println("\nDetails-------");
        System.out.println("Name    : "+name);
        System.out.println("DOB     : "+DOB);
        System.out.println("Address : "+address);
    }
    public void finalizer(){
        System.out.print("Inside finalizer...");
    }

}
class Employee extends Person{
    String position, department;
    public Employee(){
        System.out.println("Employee Constructor");
    }
    public Employee(String position, String department){   
        this.position = position;
        this.department = department;
    }

    @Override
    public void getData(){
        System.out.println("\nPosition   : "+position);
        System.out.println("Department : "+department);
    }
    public void finalizer(){
        System.out.print("Inside finalizer...");
    }

}
public class Q22_21withPara {
    public static void main(String[] args) {
        Person p = new Person("Hagimaru", "30/12/2009", "India");
        Employee e = new Employee("Child", "Entertainment");

        p.getData();
        e.getData();
        e.finalizer();

        
    }
}
