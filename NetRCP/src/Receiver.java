import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
 
public class Receiver extends Thread{
    Socket socket;
    DataInputStream in;
 
    Receiver(Socket socket) {
        this.socket = socket;
        try {
            in = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
        }
    }
 
    
    public void run() {
        while (in != null) {
        	System.out.println("innnnnnn");
            try {
                Game.clientvalue=Integer.valueOf(in.readUTF());
                
            } catch (IOException e) {
            }
        }
        Game.k=1;
        
    }
    
}