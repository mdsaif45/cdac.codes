abstract class Mark{
    abstract double getPercentage();
}
class A extends Mark{
    double sub1, sub2, sub3;
    A(double sub1, double sub2, double sub3){
        this.sub1 = sub1; this.sub2 = sub2; this.sub3 = sub3;
    }
    public double getPercentage(){
        double percent = 0;
        percent = (sub1 + sub2 + sub3)/3;

        return percent;
    }
}
class B extends Mark{
    double sub1, sub2, sub3, sub4;
    B(double sub1, double sub2, double sub3, double sub4){
        this.sub1 = sub1; this.sub2 = sub2; this.sub3 = sub3; this.sub4 = sub4;
    }
    public double getPercentage(){
        double percent = 0;
        percent = (sub1 + sub2 + sub3 + sub4)/4;

        return percent;
    }
}
public class Q28_Percentage {
    public static void main(String[] args) {
        A s1 = new A(98, 91, 90);
        B s2 = new B(88, 90, 85, 92);
        
        System.out.println("\nPercentage of student 1 : "+ s1.getPercentage());
        System.out.println("Percentage of student 2 : "+ s2.getPercentage());

    }
}
