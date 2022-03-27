package academy.mindswap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        ServerSocket serverSocket = new ServerSocket(8081);

        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String line2;
            String line = in.readLine();
            if(line == null) {
                continue;
            }
            System.out.println(line);
            while ((line2 = in.readLine()) != null && line2.length() != 0) {
                System.out.println(line2);
            }

          //  System.out.println(line);
            String[] parts = line.split(" ");

            String[] a = "GET / HTTP/1.1".split(" ");

            String method = parts[0];
            String path = parts[1];  // {"GET", "/orangotango.jpg"}
            String header;
               if(path.lastIndexOf(".") == -1){
                    path = path + "/index.html";
                }
                File index = new File("www"+path);
                if (index.exists()) {
                    String contentType = Files.probeContentType(index.toPath());
                    byte[] indexResponse = Files.readAllBytes(index.toPath());

                    header = "HTTP/1.1 200 OK\r\n" +
                            "Content-Type: " + contentType + "; charset=UTF-8 \r\n" +
                            "Content-Length: " + indexResponse.length + "\r\n" +
                            "Connection: close\r\n" +
                            "Set-Cookie: testeDiogo=ola\r\n" +

                            "\r\n";
                    out.writeBytes(header);
                    out.write(indexResponse);
                    socket.close();
                    continue;
                }

                index = new File("www/404.html");
                byte[] indexResponse = Files.readAllBytes(index.toPath());
                header = "HTTP/1.1 404 Document not Found FDP\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + indexResponse.length+ "\r\n" +
                    "Connection: close\r\n" +
                    "\r\n";


            out.writeBytes(header);
            out.write(indexResponse);
            socket.close();
        }
    }
}
