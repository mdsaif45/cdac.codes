abstract class debug {
    abstract void command();
}

class A extends debug {
    private int i;

    public A( int i){
        this.i = i;
    }
    void command(){
        System.out.println( "i = " + i);
    }
}
class B extends debug{
    private double d;

    public B(double d){
        this.d = d;
    }
    void command(){
        System.out.println( "d = " + d);
    }
}

class C extends debug{
    private String s;

    public C(String s) {
        this.s = s;
    }
    void command() {
        System.out.println( "s = " + s);
    }
}

public class Q25_Dbug {
    public static void main(String arg[]) {

        A o1 = new A(3);
        B o2 = new B(4.3);
        C o3 = new C("Hero");

        o1.command();
        o2.command();
        o3.command();
    }
}