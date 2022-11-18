import java.util.Scanner;

// Write a Java program to get the age of a person and 
// find the age group of that person as

public class Q3_Age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the age of person  : ");
        int age = s.nextInt();

        System.out.print("Age group of that person : ");

        if(age >= 0 && age <= 3)
            System.out.println("Toddlers");
        else if(age >= 4 && age <= 8)
            System.out.println("Kids");
        else if(age >= 9 && age <= 12)
            System.out.println("Child");
        else if(age >= 13 && age <= 18)
            System.out.println("Teens");
        else if(age >= 19 && age <= 40)
            System.out.println("Adults");
        else if(age >= 41 && age <= 60)
            System.out.println("Matured Adults");
        else if(age >= 61 && age <= 75)
            System.out.println("Senious");
        else
            System.out.println("Super Seniors");

        s.close();
    }
}
