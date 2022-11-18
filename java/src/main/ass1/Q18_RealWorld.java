class ComputerLanguages{
    private String languages;
    private String usage;
    private int difficultyLevel;
    private int learningDay;

    //Default constructor
    protected ComputerLanguages(){}
    //parametrised constructor
    protected ComputerLanguages(String languages, String usage, int difficultyLevel, int learningDay){
        this.languages = languages;
        this.usage = usage;
        this.difficultyLevel = difficultyLevel;
        this.learningDay = learningDay;
    }
    //print details 
    protected void printDetails(){
        System.out.println("\nLanguage name : "+languages);
        System.out.println("Usage         : "+usage);
        System.out.println("difficulty    : "+difficultyLevel);
        System.out.println("Learning Days : "+learningDay);
    }
}
public class Q18_RealWorld {
    public static void main(String[] args) {
        ComputerLanguages c = new ComputerLanguages("Python", "ML, AI, Newtorking", 1, 90);
        c.printDetails();
        ComputerLanguages c1 = new ComputerLanguages("Java", "Webpages , games", 3, 120);
        c1.printDetails();
    }   
}
