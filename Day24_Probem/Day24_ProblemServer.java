package Day24_Probem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Day24_ProblemServer {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(9000);
            Socket connectedClient = server.accept();
            PrintWriter pw = new PrintWriter(connectedClient.getOutputStream(), true);) {
            pw.println(new Date().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
