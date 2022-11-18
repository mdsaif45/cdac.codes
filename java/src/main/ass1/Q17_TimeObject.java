import java.util.Scanner;

class Time{
    private int Hours, minutes, seconds;
    Scanner s = new Scanner(System.in);

    protected Time(){     
        // System.out.println("Starting Time");
    }

    // input time from user
    protected void getTime(){
        
        while(true){
            System.out.println("Enter the hours, minutes and seconds : ");
            this.Hours = s.nextInt();
            this.minutes = s.nextInt();
            this.seconds = s.nextInt();
            if(Hours > 60 || minutes > 60 || seconds > 60){
                System.out.println("Invalid Input");
                continue;
            }
            break;
        }
    }
    //display time
    protected void DisplayTime(){
        System.out.println(Hours+":"+minutes+":"+seconds);
    }

    // find diference between time by passing time object
    protected void DifferenceTime(Time t){

        System.out.println("\nTime Difference");
        if(this.Hours>t.Hours && this.minutes>t.minutes && this.seconds>t.seconds){
            this.Hours -= t.Hours;
            this.minutes -= t.minutes;
            this.seconds -= t.seconds;
            System.out.println(Hours+":"+minutes+":"+seconds);
            return;
        }
        else if(this.seconds<t.seconds)
            if(this.minutes<t.minutes){
                this.Hours--; this.minutes += 60;
            }
            else{
                this.minutes--; this.seconds += 60;
            }
        else if(this.minutes<t.minutes){
            this.Hours--; this.minutes += 60;
        }
        this.Hours -= t.Hours;
        this.minutes -= t.minutes;
        this.seconds -= t.seconds;

        System.out.println(" "+this.Hours+":"+this.minutes+":"+this.seconds);
    }
}
public class Q17_TimeObject {

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("\nStarting Time");
        t1.getTime();
        System.out.println("\nEnding Time");
        t2.getTime();

        System.out.println("\nStarting Time");
        t1.DisplayTime();
        System.out.println("Ending Time");
        t2.DisplayTime();

        t2.DifferenceTime(t1);
    }
}
