// 2. Create a Demo class to Read & write image/text files.
import java.io.File;  
import java.io.FileWriter;
import java.util.Scanner;

public class Q2_Demo {
    public static void main(String[] args) throws Exception {
        
        File f = new File("file.txt"); 

        // create New File if not exist
        if(!f.exists()){
            f.createNewFile();
            System.out.println("\n>> File is created : "+f.getName());
        }
        // check file is readable or writable or not
        if(f.canRead() && f.canWrite())
            System.out.println(">> File ready for R/W.");
        else
            System.out.println("R/W error!!!");

        // writing file--------------------------------------------------------
        System.out.println("\n>> Writing.....");
        // creating file writer object
        FileWriter pen = new FileWriter("file.txt");
        // writing string into file
        pen.write("Java is a funny language..");
        pen.close();
        System.out.println(">> Successfully wrote to the file.");

        // reading file--------------------------------------------------------
        System.out.println("\n>> Reading.....");
        System.out.println(">> Content of the file.");
        Scanner read = new Scanner(f);
        // reading string from file
        while (read.hasNextLine()) 
            System.out.println(read.nextLine());
        
        read.close();

        // length of string inside file
        System.out.println("\nlength of file : "+f.length());
    }
}
