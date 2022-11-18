// 41.Implement multilevel inheritance using different packages.

import pkg.A;

class B extends A{
   B(){
       super();
       System.out.println("Default constructor : B");
   }
}
class C extends B{
   C(){
       super();
       System.out.println("Default constructor : C");
   }
   void print(){
       System.out.println("print function...");
   }
}
public class Q41_MultilevelInheri {
   public static void main(String[] args) {
       C c = new C();
       c.print();
   }
}
