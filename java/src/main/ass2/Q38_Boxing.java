
// 38. Create sample classes to understand boxing & unboxing

public class Q38_Boxing {
    public static void main(String[] args) {

        int a = 10;
        // auto boxing changing primitive to wrapper 
        // compiler do like     
        // Integer wrapperInt = Integer.valueOf(a);
        Integer wrapperInt = a;
        // auto unboxing changing wrapper to primitive
        // compiler do like     
        // int primitiveInt = wrapperInt.intValue();
        int primitiveInt = wrapperInt;

        System.out.println("Wrapper Integer   : "+wrapperInt);
        System.out.println("Primitive Integer : "+primitiveInt);
    }
}
