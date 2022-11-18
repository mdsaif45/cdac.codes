import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) throws IOException{
        Socket sock=new Socket("localhost",6666);
        //ObjectOutputStream out=new ObjectOutputStream(sock.getOutputStream());
        //out.writeUTF("Hello Server");
        
        PrintWriter o=new PrintWriter(sock.getOutputStream());
        o.println("Are you getting my message...?");
        o.flush();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
        String str=(String)br.readLine();
        System.out.println("Server Says="+str);
        
        o.close();
        sock.close();
    } 
}