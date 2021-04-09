package ru.gb.chat;

import ru.gb.chat.server.ChatServer;
import ru.gb.chat.server.ChatServerException;

import java.io.IOException;

public class ServerApp {
    public static void main(String[] args) {
        try {
            new ChatServer();
        } catch (IOException e) {
            throw new ChatServerException("ошибка запуска сервера",e);
        }
    }
}
