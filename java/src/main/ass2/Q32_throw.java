import java.io.FileNotFoundException;
import java.io.IOException;

// 32.Write a program to throw a checked exception explicitly using 'throw' keyword and 
//     a) Handle the exception in same method.
//     b) use throws clause and handle the exception in some other method (calling method) 
//     c) Don't either handle or use the throws clause. Observe the result.

public class Q32_throw {
    public void error()throws IOException{
        throw new IOException();
    }
    public static void main(String[] args) throws Exception{
        try{
            throw new FileNotFoundException();
        } 
        catch(Exception e){
            System.out.println("\nerror : File Not Found Exception");
            e.getStackTrace();
            System.out.println(e);
        }
        finally{
            Q32_throw e = new Q32_throw();
            e.error();
        }
    }
}
