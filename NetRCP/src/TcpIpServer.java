import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
 
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("���������� Ŭ���̾�Ʈ ���� ��� ��...");
 
            socket = serverSocket.accept();
            System.out.println("���������� Ŭ���̾�Ʈ �����...");
            
            Game game = new Game(socket);
            
        } catch (Exception e) {
        }
    }
}
