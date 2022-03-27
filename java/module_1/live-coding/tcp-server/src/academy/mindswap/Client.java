package academy.mindswap;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8081);

        BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while (!socket.isClosed()){
            String message = consoleReader.readLine();
            socketWriter.write(message);
            socketWriter.newLine();
            socketWriter.flush();
        }
        socket.close();
    }
}
