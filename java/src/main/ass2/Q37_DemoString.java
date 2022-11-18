// 37.Create String Demo class and perform different string manipulation methods

public class Q37_DemoString {
    public static void main(String[] args) {

        String a = "Hello ";
        String b = "World...";
        String c = a.concat(b);     // concatinate two strings with concat()
        String d = a + b;           // concatinate two strings with + operator
        System.out.println(c+"\n"+d);
        
        System.out.println(c.length());             // return lenght of the string 
        System.out.println(c.charAt(6));      // return char at passing arg index
        System.out.println(c.indexOf("W"));     // return index of char passed as arg 
        System.out.println(c.contains("d"));      // return true if it contain that char
        System.out.println(c.replace("World", "baby"));  // replace substring
        
        String str1 = "Test123";
        String str2 = "Test" + 123;
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        }
    }
}
