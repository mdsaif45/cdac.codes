import java.util.Scanner;

// Write a Java program that will read in month and day (as numerical value). The
// program will return the equivalent zodiac sign.

public class Q7_Zodiac {
    public static String zodiac(int day, int month){
        String sign="";
        if(month>12)
            return "{zodiac error}";
        else if(month == 1){
            if(day >= 20 && day <= 31)
                sign = "Aquarius";
            else
                sign = "Capricorn";
        }
        else if(month == 2){
            if(day >= 19 && day <= 29)
                sign = "Pisces";
            else
                sign = "Aquarius";
        }
        else if(month == 3){
            if(day >= 21 && day <= 31)
                sign = "Aries";
            else
                sign = "Pisces";
        }
        else if(month == 4){
            if(day >= 20 && day <= 30)
                sign = "Taurus";
            else
                sign = "Aries";
        }
        else if(month == 5){
            if(day >= 21 && day <= 31)
                sign = "Gemini";
            else
                sign = "Taurus";
        }
        else if(month == 6){
            if(day >= 21 && day <= 30)
                sign = "Cancer";
            else
                sign = "Gemini";
        }
        else if(month == 7){
            if(day >= 23 && day <= 30)
                sign = "Lio";
            else
                sign = "Cancer";
        }
        else if(month == 8){
            if(day >= 23 && day <= 30)
                sign = "Virgo";
            else
                sign = "Lio";
        }
        else if(month == 9){
            if(day >= 23 && day <= 30)
                sign = "Libra";
            else
                sign = "Virgo";
        }
        else if(month == 10){
            if(day >= 23 && day <= 31)
                sign = "Scorpios";
            else
                sign = "Libra";
        }
        else if(month == 11){
            if(day >= 22 && day <= 30)
                sign = "Sagittarius";
            else
                sign = "Scorpio";
        }
        else if(month == 12){
            if(day >= 22 && day <= 31)
                sign = "Capricorn";
            else
                sign = "Sagittarius";
        }

        return sign;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int day, month;
        String m="";

        System.out.print("\nEnter month : ");
        month = s.nextInt(); 
        System.out.print("Enter day   : ");
        day = s.nextInt(); 

        if(month==1) m = "Janwary";
        else if(month==2) m = "Febrary";
        else if(month==3) m = "March";
        else if(month==4) m = "April";
        else if(month==5) m = "May";
        else if(month==6) m = "June";
        else if(month==7) m = "July";
        else if(month==8) m = "August";
        else if(month==9) m = "September";
        else if(month==10) m = "Octuber";
        else if(month==11) m = "November";
        else if(month==12) m = "December"; 
        else m = "{month error}";

        System.out.println("\nZodiac sign for "+m+" "+(day>31?"{date error}":day)+" is "+Q7_Zodiac.zodiac(day, month));
        s.close();
    }
}