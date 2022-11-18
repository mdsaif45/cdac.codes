import java.util.Scanner;

// 17. Write a program to create a room class, the attributes of this class is 
//     roomno, roomtype, roomarea and ACmachine. 
//     In this class the member functions are setdata and displaydata.
class Room{
    private int roomno, ACmachine;
    private String roomtype, roomarea;
    Scanner s = new Scanner(System.in);

    public void setdata(){
        System.out.print("\nEnter room number : ");
        roomno = s.nextInt();
        System.out.print("Enter room type   : ");
        roomtype = s.next();s.nextLine();
        System.out.print("Enter room area   : ");
        roomarea = s.nextLine();
        System.out.print("Enter number of AC: ");
        ACmachine = s.nextInt();
    }
    public void displaydata(){
        System.out.print("\nRoom number : " + roomno);
        System.out.print("\nRoom type   : "+ roomtype);
        System.out.print("\nRoom area   : "+ roomarea);
        System.out.print("\nNumber of AC: "+ ACmachine);
    }
}
public class Q17_Room {
    public static void main(String[] args) {
        Room room = new Room();

        room.setdata();
        room.displaydata();
    }
}
