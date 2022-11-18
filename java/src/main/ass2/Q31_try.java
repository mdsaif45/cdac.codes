
// 31. Write a program to demonstrate the use of try, catch, finally throw and throws keywords and demonstrate the following points in the program. 
//     a) Multiple catch blocks. 
//     b) try-catch-finally combination. 
//     c) try-finally combination. 
//     d) Exception propagation among many methods. 
//     e) Use of getMessage(), printStackTrace() function of Throwable class. 
//     f) Nested try blocks

public class Q31_try {
    void getError(){
        int t = 4/0;
        System.out.println(t);
    }
    public void error(){
        try {
            getError();
        } catch (Exception e) {
            System.out.println("\nerror : Exceptionn inside function");
        }
    }

    public static void main(String[] args) throws Exception{
        Q31_try t = new Q31_try();
        try {
            try{
                int num = 4;
                num = Integer.parseInt("str");
                System.out.println(num);
            }
            catch(NumberFormatException e){
                System.out.println("\nerror : Number Format Exception");
                e.printStackTrace();
                // e.getMessage();     
            }
            finally{
                t.error();
                int a[]=new int[3];
                System.out.println(a[5]);
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("\nerror : / by zero");
            e.getMessage();
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nerror : Index out of bound");
            e.getMessage();
        } 
        finally{
            System.out.println("\nfinally block...");
        }

        
        
    }
}
