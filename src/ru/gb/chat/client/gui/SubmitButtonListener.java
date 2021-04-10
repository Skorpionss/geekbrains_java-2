package ru.gb.chat.client.gui;

import ru.gb.chat.client.gui.api.Sender;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitButtonListener implements ActionListener {
    private final JTextField inputField;
    private final Sender sender;

    public SubmitButtonListener(JTextField inputFlield, Sender sender) {
        this.inputField = inputFlield;
        this.sender = sender;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sender.send(inputField.getText());
        inputField.getText();
    }
}
