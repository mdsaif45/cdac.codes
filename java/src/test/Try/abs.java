abstract class abs{
    int num;
    abstract void print();
    public void display(){
        System.out.println("Hello");
    }
}
interface A{
    // default, static
    // v9 private
    void print();

}
interface A2{
    // default, static
    // v9 private
    void print();
}
interface B extends A, A2{

}
class c implements A{

}