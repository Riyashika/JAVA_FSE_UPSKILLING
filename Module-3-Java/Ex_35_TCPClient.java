import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Ex_35_TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println("Hello Server");
            String response = br.readLine();
            System.out.println("Server: " + response);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}