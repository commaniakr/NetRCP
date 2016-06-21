import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
 
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("가위바위보 클라이언트 연결 대기 중...");
 
            socket = serverSocket.accept();
            System.out.println("가위바위보 클라이언트 연결됨...");
            
            Game game = new Game(socket);
            
        } catch (Exception e) {
        }
    }
}
