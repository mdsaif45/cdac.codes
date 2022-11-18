// Write a JAVA program which computes sum of two objects by accepting the data from command prompt.
class SumObject{
    private int num ;
    
    public SumObject(){
        num = 0;    
    }
    public SumObject(int num){
        this.num = num;    
    }
    // sum of two objects and return new data object
    SumObject sum(SumObject obj){
        SumObject t = new SumObject();
        t.num = this.num + obj.num;

        return t;
    }
    void display(){
        System.out.println("Sum : "+this.num);
    }
}
public class Q7_SumObject {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        SumObject obj1 = new SumObject(num1);
        SumObject obj2 = new SumObject(num2);
        SumObject obj3 = new SumObject();

        obj3 = obj2.sum(obj1);

        obj3.display();

    }
}

