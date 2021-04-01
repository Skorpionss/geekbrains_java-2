package lesson_6.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public Client() {
        try {
            Socket socket = new Socket("127.0.0.1", 8000);
            System.out.println("Соединение с сервером установленно");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);

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

            new Thread(() -> {
                while (true) {
                    try {
                        String message = in.readUTF();
                        System.out.println("От сервера: " + message);
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
