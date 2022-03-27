package academy.mindswap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("Server is running");
        BufferedReader in;
        while (true) {
            Socket clientSocket = serverSocket.accept();
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            while (!clientSocket.isClosed()) {
                String line = in.readLine();

                if (line == null) {
                    clientSocket.close();
                    break;
                }
                System.out.println("client sent: ".concat(line));
            }
        }
    }

}
