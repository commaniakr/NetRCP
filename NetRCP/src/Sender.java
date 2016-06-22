import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
 
public class Sender extends Thread{
    Socket socket;
    DataOutputStream out;
    
    
    Sender(Socket socket) {
        this.socket = socket;
        try {
            out = new DataOutputStream(socket.getOutputStream());
          

        } catch (Exception e) {
           
        }
    }
    
    public static void valueInput(int a){
       Game.clientvalue=a;
    }
    
    
     public void run() {
       
        while (out != null) {
        	System.out.println("outttttt");
            try {
                out.writeUTF(Integer.toString(Game.scanvalue));
            } catch (IOException e) {
            }
        }
    }
    
}