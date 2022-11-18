
// 30.Write a program for the following 
// 1. Example for call by value. 
// 2. Example for call by reference.
class Call{
    private int num;

    public Call(){
        num = 0;
    }
    public Call(int num){
        this.num = num;
    }
    public int get(){
        return num;
    }
    public void callByValue(int num){
        num *= num;
    }
    public void callByReference(Call c){
        c.num *= c.num;
    }
}
public class Q30_CallBy {
    public static void main(String[] args) {
        Call value = new Call();
        // call by value
        int val = 4;
        value.callByValue(val);
        System.out.println("val : "+val);
        // call by reference 
        Call reference =  new Call(val);
        reference.callByReference(reference);
        System.out.println("val : "+reference.get());
    }
}
