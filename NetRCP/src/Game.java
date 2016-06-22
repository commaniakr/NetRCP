import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
 
public class Game {
	Socket socket;

	static int scanvalue = 0;
	static int clientvalue = 0;
	static int k = 0;
	
	public static void valueInput(int a){
		scanvalue = a;
	}
		
	 
    public Game(Socket socket) {
    	    	
    	DataOutputStream out = null;
    	DataInputStream in = null;
    	
		try {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
		}

        this.socket = socket;
       
        
        
        System.out.println("클라이언트의 입력 기다리는 중...");
 
        try {
			clientvalue = Integer.parseInt(in.readUTF());
        } catch (IOException e) {
        }
        
	}
}
    


