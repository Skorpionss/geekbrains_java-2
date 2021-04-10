package ru.gb.chat.client;

import ru.gb.chat.client.gui.ChatFrame;

public class ChatClient {
    private final ChatFrame chatFrame;
    private final ChatCommunication chatCommunication;

    public ChatClient(String host, int port) {
        chatCommunication = new ChatCommunication(host, port);

        chatFrame = new ChatFrame();
    }
}


