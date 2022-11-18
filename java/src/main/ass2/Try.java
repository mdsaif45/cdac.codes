public class Try {
    public static void main(String[] args) {
        String name = System.console().readLine("Please type your name and press Enter%n");
        System.out.printf("Hello, %s!\n", name);
        //To read passwords (without echoing as in unix terminal)
        // char[] password = System.console().readPassword();
        double d = Double.parseDouble(System.console().readLine());
        System.out.println(d);
    }
}
