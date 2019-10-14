package com.bajo.gui;

import javax.swing.*;
import java.awt.*;

public class MyGui11 {
    private JPanel mainPanel;
    private JPanel primaryPane;
    private JButton button1;

    public static void main(String[] args) {
        MyGui11 myGui11 = new MyGui11();
        JFrame frame = new JFrame("My Gui 55");
        frame.setContentPane(myGui11.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
