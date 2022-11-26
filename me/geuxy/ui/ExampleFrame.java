package me.geuxy.ui;

import me.geuxy.util.Fonts;

import javax.swing.*;
import java.awt.*;

public class ExampleFrame extends JFrame {

    public ExampleFrame(String title, int width, int height) {

        // The font for label.
        Font fontLarge = Fonts.arial(25);

        // Set title and close operation.
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set window size and location (center).
        setSize(width, height);
        setLocationRelativeTo(null);

        // Create panel with label as an example.
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, getWidth(), getHeight());

        JLabel label = new JLabel("Hi there!");
        label.setFont(fontLarge);
        panel.add(label);

        // Add component and set visible.
        add(panel);
        setVisible(true);
    }

}
