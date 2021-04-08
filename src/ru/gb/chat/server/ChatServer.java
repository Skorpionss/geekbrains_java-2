package ru.gb.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChatServer {
    private final AuthenticationService authenticationService;
    private final Set<ClientHandler> loggedClients;

    public ChatServer() throws IOException {
        authenticationService = new AuthenticationService();
        loggedClients = new HashSet<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();
        } catch (IOException e) {
            throw new ChatServerException("Ошибка", e);
        }
    }

    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }


    public void subscribe(ClientHandler clientHandler) {
        loggedClients.add(clientHandler);
    }

    public void unsubscribe(ClientHandler clientHandler) {
        loggedClients.remove(clientHandler);
    }

    public void broadcast(String message) {
        for (ClientHandler clientHandler : loggedClients) {
            clientHandler.sendMessage(message);
        }
    }


    public boolean isLoggedIn(String name) {
        Iterator<ClientHandler> iterator = loggedClients.iterator();
        while (iterator.hasNext()) {
            ClientHandler client = iterator.next();
            if (client.getName().equals(name)) ;
            return true;
        }
        return false;
    }
}

