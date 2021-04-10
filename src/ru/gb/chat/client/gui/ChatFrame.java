package ru.gb.chat.client.gui;

import javax.swing.*;
import java.awt.*;

public class ChatFrame extends JFrame {
    public ChatFrame() {
        setTitle("Chat v1.0");
        setBounds(20, 20, 400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        top.add(chatArea, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        bottom.add(inputField, BorderLayout.CENTER);
        JButton submitBtn = new JButton("Отправить");

        bottom.add(submitBtn, BorderLayout.EAST);

        add(top, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        setVisible(true);
    }

}
