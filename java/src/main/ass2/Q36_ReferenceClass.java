// 36. Build a class which has references to other classes. Instantiate these reference variables and invoke instance methods.

class Reference{
    public Reference(){
        System.out.println("Reference Default constructor..");
    }
    public void print(){
        System.out.println("Printing.......");
    }
}
public class Q36_ReferenceClass {
    //  reference variable of Reference class 
    Reference r;
    // default constructor 
    Q36_ReferenceClass(){
        // craeting object of Reference class
        r = new Reference();
        // calling print function of reference class using object
        r.print();
    }
    public void display(){
        System.out.println("Display fucntion");
    }
    public static void main(String[] args) {
        Q36_ReferenceClass r = new Q36_ReferenceClass();
        // call display function of Q36_ReferenceClass
        r.display();
    }
}
