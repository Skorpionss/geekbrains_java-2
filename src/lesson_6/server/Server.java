package lesson_6.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket accept = serverSocket.accept();
            System.out.println("Соединение с клиентом установленно");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
