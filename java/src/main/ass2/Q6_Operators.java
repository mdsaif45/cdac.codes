// Write a program to give the examples of operators.
// 1) Increment and decrement operators.
// 2) Bitwise Complement Operator.
// 3) Arithmetic operator.
// 4) Relational Operator
// 5) Bitwise operator.
// 6) Conditional Operator

import java.util.Scanner;
public class Q6_Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the number : ");
        int a = s.nextInt(); int t = a;
        System.out.println("\n1) Increment and decrement operators.");
        System.out.println("   Pre increment (++a)  : "+ ++a);   a=t;
        System.out.println("   Post increment (a++) : "+ a++);  a=t;
        System.out.println("   Pre decrement (--a)  : "+ --a);   a=t;
        System.out.println("   Post decrement (a--) : "+ a--);  a=t;

        System.out.println("\n2) Bitwise Complement Operator.");
        System.out.println("   Complement (~a) : "+ ~a);  

        System.out.print("\nEnter two number : ");
        a = s.nextInt(); int b = s.nextInt();
        System.out.println("\n3) Arithmetic operator.");
        System.out.println("   Addition       (a+b) : "+ (a+b));  
        System.out.println("   Subtraction    (a-b) : "+ (a-b));  
        System.out.println("   Multiplication (a*b) : "+ (a*b));   
        System.out.println("   Division       (a/b) : "+ (a/b)); 

        System.out.println("\n4) Relational Operator.");
        System.out.println("   double equal to (a == b) : "+ (a == b)); 
        System.out.println("   Not equal to    (a != b) : "+ (a != b));
        System.out.println("   Greater than    (a > b)  : "+ (a > b));  
        System.out.println("   Less than       (a < b)  : "+ (a < b)); 
        System.out.println("   Greater than equal to (a >= b) : "+ (a >= b)); 
        System.out.println("   Less than equal to    (a >= b) : "+ (a >= b)); 

        System.out.println("\n5) Bitwise operator.");
        System.out.println("   AND          (a & b) : "+ (a & b));  
        System.out.println("   exclusive OR (a ^ b) : "+ (a ^ b)); 
        System.out.println("   includive OR (a | b) : "+ (a | b));  
        
        System.out.print("\nEnter two booleans : ");
        boolean b1 = s.nextBoolean(); boolean b2 = s.nextBoolean();
        System.out.println("\n6) Conditional Operator.");
        System.out.println("   Condition-AND (a && b) : "+ (b1 && b2)); 
        System.out.println("   Condition-OR  (a || b) : "+ (b1 || b2)); 

        s.close();
    }
}
