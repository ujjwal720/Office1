package ExtentReports;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // the port number that the server will listen on
    private static final int PORT = 1234;

    public static void main(String[] args) throws IOException {
        // create a ServerSocket object to listen for incoming connections
        ServerSocket serverSocket = new ServerSocket(PORT);

        while (true) {
            // accept an incoming client connection
            Socket clientSocket = serverSocket.accept();
            // create a separate thread to handle the client
            new ClientHandler(clientSocket).start();
        }
    }
}

class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // create a BufferedReader to read messages from the client
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            // create a PrintWriter to send messages to the client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                // read a message from the client
                String message = in.readLine();
                if (message == null) {
                    // break out of the loop if the client has disconnected
                    break;
                }
                // echo the message back to the client
                out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
