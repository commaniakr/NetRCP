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
        System.out.println("����=1, ����=2, ��=3. �Է��ϼ���:");
        Scanner scan = new Scanner(System.in);
        scanvalue = scan.nextInt();
        System.out.println("Ŭ���̾�Ʈ�� �Է� ��ٸ��� ��... (�ڽ��� ���� �̸� �������� ������!)");
		try {
			out.writeUTF("�Է��ϼ���...");
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
				System.out.println("���º�");
				try {
					out.writeUTF("���º�");
					} catch (Exception e) {
					}
				break;
			case "2":
				System.out.println("����� �����ϴ�!!");
				try {
					out.writeUTF("����� �̰���ϴ�!!");
					} catch (Exception e) {
					}
				break;	
			case "3":
				System.out.println("����� �̰���ϴ�!!");
				try {
					out.writeUTF("����� �����ϴ�!!");
					} catch (Exception e) {
					}
				break;
			}
			break;
		case 2:
			switch(clientvalue) {
			case "1":
				System.out.println("����� �̰���ϴ�!!");
				try {
					out.writeUTF("����� �����ϴ�!!");
					} catch (Exception e) {
					}
				break;
			case "2":
				System.out.println("���º�");
				try {
					out.writeUTF("���º�");
					} catch (Exception e) {
					}
				break;
			case "3":
				System.out.println("����� �����ϴ�!!");
				try {
					out.writeUTF("����� �̰���ϴ�!!");
					} catch (Exception e) {
					}
				break;
			}
			break;
		case 3:
			switch(clientvalue) {
			case "1":
				System.out.println("����� �����ϴ�!!");
				try {
					out.writeUTF("����� �̰���ϴ�!!");
					} catch (Exception e) {
					}
				break;
			case "2":
				System.out.println("����� �̰���ϴ�!!");
				try {
					out.writeUTF("����� �����ϴ�!!");
					} catch (Exception e) {
					}
				break;
			case "3":
				System.out.println("���º�");
				try {
					out.writeUTF("���º�");
					} catch (Exception e) {
					}
				break;
			}		
			break;
		}
	}
}

