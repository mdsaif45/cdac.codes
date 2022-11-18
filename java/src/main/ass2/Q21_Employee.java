
// 21. Define a base class person and a derived class employee with single inheritance. 
//      -Define SetData() member functions in each of the class with different signatures 
//          to set the data members and demonstrate overloading of member functions.
//      -Define GetData() member functions in each of the class with same signatures 
//          to display data and demonstrate overriding of member functions.

class Person{
    private String name, DOB, address;

    public void setData(String name, String DOB, String address){
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
}
class Employee extends Person{
    String position, department;

    public void setData(String position, String department){
        this.position = position;
        this.department = department;
    }
    @Override
    public void getData(){
        System.out.println("\nPosition   : "+position);
        System.out.println("Department : "+department);
    }
}
public class Q21_Employee {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();

        p.setData("Bob", "12/11/1994", "Delhi");
        p.getData();
        e.setData("HR", "R&D");
        e.getData();
    }
}
