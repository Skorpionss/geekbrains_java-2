package ru.gb.chat.client;

import ru.gb.chat.client.gui.ChatFrame;

public class ChatClient {
    private final ChatFrame frame;
    private final ChatCommunication communication;

    public ChatClient(String host, int port) {
        communication = new ChatCommunication(host, port);
        frame = new ChatFrame();
    }
}
