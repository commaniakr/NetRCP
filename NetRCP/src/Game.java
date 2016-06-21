import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
 
public class Game {
	Socket socket;

    
 
    public Game(Socket socket) {
    	int scanvalue = 0;
    	String clientvalue = null;
    	DataOutputStream out = null;
    	DataInputStream in = null;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
		}
        this.socket = socket;
        System.out.println("가위=1, 바위=2, 보=3. 입력하세요:");
        Scanner scan = new Scanner(System.in);
        scanvalue = scan.nextInt();
        System.out.println("클라이언트의 입력 기다리는 중... (자신의 값을 미리 보여주지 마세요!)");
		try {
			out.writeUTF("입력하세요...");
			} catch (Exception e) {
			}
        try {
			clientvalue = in.readUTF();
        } catch (IOException e) {
        }
        
        switch(scanvalue) {
		case 1:
			switch(clientvalue) {
			case "1":
				System.out.println("무승부");
				try {
					out.writeUTF("무승부");
					} catch (Exception e) {
					}
				break;
			case "2":
				System.out.println("당신이 졌습니다!!");
				try {
					out.writeUTF("당신이 이겼습니다!!");
					} catch (Exception e) {
					}
				break;	
			case "3":
				System.out.println("당신이 이겼습니다!!");
				try {
					out.writeUTF("당신이 졌습니다!!");
					} catch (Exception e) {
					}
				break;
			}
			break;
		case 2:
			switch(clientvalue) {
			case "1":
				System.out.println("당신이 이겼습니다!!");
				try {
					out.writeUTF("당신이 졌습니다!!");
					} catch (Exception e) {
					}
				break;
			case "2":
				System.out.println("무승부");
				try {
					out.writeUTF("무승부");
					} catch (Exception e) {
					}
				break;
			case "3":
				System.out.println("당신이 졌습니다!!");
				try {
					out.writeUTF("당신이 이겼습니다!!");
					} catch (Exception e) {
					}
				break;
			}
			break;
		case 3:
			switch(clientvalue) {
			case "1":
				System.out.println("당신이 졌습니다!!");
				try {
					out.writeUTF("당신이 이겼습니다!!");
					} catch (Exception e) {
					}
				break;
			case "2":
				System.out.println("당신이 이겼습니다!!");
				try {
					out.writeUTF("당신이 졌습니다!!");
					} catch (Exception e) {
					}
				break;
			case "3":
				System.out.println("무승부");
				try {
					out.writeUTF("무승부");
					} catch (Exception e) {
					}
				break;
			}		
			break;
		}
	}
}

