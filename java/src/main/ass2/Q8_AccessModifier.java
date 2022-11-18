// Write a JAVA program which illustrates the concept of access specifiers.
class Play{
    // private access specifier - scope with in owm class
    private int character;
    // public access specifier - scope every where
    public Play(){ character=3; }
    // default access specifier - scope within same package
    void costume(){
        System.out.println("Default method.."+character);
    }
    // protected access specifier - scope within own class and other packages through inherited class
    protected void act(){
        System.out.println("Protected method..");
    } 
}
public class Q8_AccessModifier {
    public static void main(String[] args) {
        // default constructor is public to is visible everywhere
        Play p = new Play();

        // p.character; // compile time error - character is not visible 
        p.costume();    // no error because accessing within same package
        p.act();        
    }
}
