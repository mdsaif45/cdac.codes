import java.util.Scanner;
class Time{
    private int Hours, minutes, seconds;
    Scanner s = new Scanner(System.in);

    // input time from users
    protected void getTime(){                   //8, 57, 34
        System.out.println("\nEnter 1st Time : ");
        this.Hours = s.nextInt();
        this.minutes = s.nextInt();
        this.seconds = s.nextInt();
    }
    // display time
    protected void displayTime(){
        System.out.println("Time : "+Hours+":"+minutes+":"+seconds);
    }
    //find difference between times
    protected void differenceTime(){
        System.out.println("\nEnter 2nd Time : ");   //10, 58, 35
        int Hours = s.nextInt(); int minutes = s.nextInt(); int seconds = s.nextInt();      
        
        System.out.println("\n "+Hours+":"+minutes+":"+seconds);
        System.out.println("- "+this.Hours+":"+this.minutes+":"+this.seconds);
        System.out.println("---------");
        
        if(Hours>this.Hours && minutes>this.minutes && seconds>this.seconds){
            Hours -= this.Hours;
            minutes -= this.minutes;
            seconds -= this.seconds;
            System.out.println(" "+Hours+":"+minutes+":"+seconds);
            return;
        }
        else if(seconds<this.seconds)
            if(minutes<this.minutes){
                Hours--; minutes += 60;
            }
            else{
                minutes--; seconds += 60;
            }
        else if(minutes<this.minutes){
            Hours--; minutes += 60;
        }
        Hours -= this.Hours;
        minutes -= this.minutes;
        seconds -= this.seconds;

        System.out.println(" "+Hours+":"+minutes+":"+seconds);
    }
}
public class Q16_Time {
    public static void main(String[] args) {
        Time t= new Time();
        
        t.getTime();
        t.displayTime();
        t.differenceTime();
        
    }
}
