
// 39. Use different methods of java defined wrapper classes.

public class Q39_Wrapper {
    public static void main(String[] args) {
        
        int g = 4;
        // Integer.valueOf() return Integer instance
        Integer arg = Integer.valueOf(g);
        System.out.println(arg);

        double d = 5.4;
        Double dub = Double.valueOf(d);
        System.out.println(dub);

        Integer i = 150;
        // intValue() return value of Integer as int
        int a = i.intValue();
        System.out.println(a);

        String s = "30";
        // Integer.parseInt() parses int value from string
        int num = Integer.parseInt(s);
        System.out.println(num);

        // Integer.toString() convert to string 
        String str = Integer.toString(num);
        System.out.println(str);
    }
}
