package lesson_6.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();
            System.out.println("Соединение с клиентом установленно");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);

            new Thread(() -> {
                while (true) {
                    try {
                        String message = in.readUTF();
                        System.out.println("от клиента: " + message);
                    } catch (IOException e) {
                        System.out.println("Соединение разорванно");
                        break;
                    }
                }
            }

            ).start();

            new Thread(() -> {
                while (true) {
                    try {
                        out.writeUTF(scanner.nextLine());
                    } catch (IOException e) {
                        System.out.println("Соединение разорванно");
                        break;

                    }
                }
            }

            ).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
