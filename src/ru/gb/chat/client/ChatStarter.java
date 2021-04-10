package ru.gb.chat.client;

import ru.gb.chat.client.gui.ChatFrame;

public class ChatStarter {
    public static void run() {
        new ChatClient("localhost", 8000);
    }
}
