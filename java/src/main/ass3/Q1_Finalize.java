// 1. Override finalize method to understand the behavior of JVM garbage collector

public class Q1_Finalize {
    protected void finalize() throws Throwable{
        try{
            System.out.println("inside finalize() method");
        }
        finally{
            // Calling finalize() of Object class
            // https://stackoverflow.com/questions/56139760/why-is-the-finalize-method-deprecated-in-java-9
            // super.finalize(); 
        }   
    }
    public static void main(String[] args) throws Throwable{
        // Creating object
        Q1_Finalize f = new Q1_Finalize();
 
        // Calling finalize method
        f.finalize();
    }
}
