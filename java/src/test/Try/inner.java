// import javax.sound.sampled.SourceDataLine;

// class A {
//     static class in{
//         void method(){
            
//         }
//     } 
//  }
// class B {
//     class in{
//         void method(){
            
//         }
//     } 
//  }
class Her{

}

public class inner {
    public static void main(String[] args) {
        // A.in i = new A.in();
        // i.method();

        // B o = new B();
        // B.in o2 = o.new in();
        // o2.method();

        new Her(){
            static void method(){
                System.out.println("Hello");
            }
            void display(){
                System.out.println("world");
            }
        };

        // new Thread(){
        //     v
        // }
    }
}
