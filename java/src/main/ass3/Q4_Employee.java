// 4. Create an Employee HashSet collection and override equals & hashCode methods to
//    understand how the set maintains uniqueness using these methods.
import java.util.HashSet;
class Employee{
    private HashSet<String> h = new HashSet<String>();
    
    public Employee(){}
    public void set(String s){
        this.h.add(s);
    }
    public void get(){
        for(String s: h)
            System.out.println(s);
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj)
            return true;
          
        // type casting of the argument. 
        Employee emp = (Employee) obj;
          
        return (emp.h == this.h && emp.h.equals(this.h));
    }
      
    @Override
    public int hashCode() {
        return this.h.hashCode();
    }
}
public class Q4_Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.set("John");
        e.set("Don");

        e.get();

        Employee e2 = new Employee();
        e2.set("Rahul");
        e2.set("Bob");

        e.get();

        System.out.println(e.equals(e2));
        System.out.println(e.hashCode());
    }
}
