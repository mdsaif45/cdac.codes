import java.io.*;
import java.net.*;

public class MyServer{
    public static void main(String[] args) throws IOException, SocketException{
        
        try{
            ServerSocket sos=new ServerSocket(6666);

            System.out.println("Listening on port....6666!");
            Socket sock=sos.accept();

            System.out.println("Client Connected!");
            //ObjectInputStream ois=new ObjectInputStream(sock.getInputStream());
            //String str=(String)ois.readUTF();
            BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String str=(String)br.readLine();
            System.out.println("Client Says="+str);

            sos.close();

        }catch(Exception e){
            // System.out.println(e);
            System.err.println(e);
        }finally{
            // sos.close();
            // out.close();
        }
        
        
        

        
        // sos.close();
        // out.close();
    } 
}