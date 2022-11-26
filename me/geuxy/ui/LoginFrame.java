package me.geuxy.ui;

import me.geuxy.util.Fonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// haram code
public class LoginFrame extends JFrame {
    JLabel titleLabel, usernameLabel, passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    String adminName = "admin", adminPassword = "admin";

    public LoginFrame(String title, int width, int height) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        int xOffset = 20;
        int widthEnd = getWidth() - 46;

        int yPadding = 20;

        Font fontSmall = Fonts.arial(15);
        Font fontNormal = Fonts.arial(20);
        Font fontLarge = Fonts.arial(25);

        // Components.
        titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(fontLarge);
        titleLabel.setBounds(xOffset, yPadding, 150, 30);

        yPadding += 40;

        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(fontSmall);
        usernameLabel.setBounds(xOffset, yPadding, 200, 30);

        yPadding += 25;

        usernameField = new JTextField();
        usernameField.setBounds(xOffset, yPadding, widthEnd, 40);
        usernameField.setFont(fontNormal);
        usernameField.setBorder(BorderFactory.createLineBorder(getBackground().darker(), 2));


        yPadding += 45;

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(fontSmall);
        passwordLabel.setBounds(xOffset, yPadding, 200, 30);


        yPadding += 25;

        passwordField = new JPasswordField();
        passwordField.setBounds(xOffset, yPadding, widthEnd, 40);
        passwordField.setFont(fontNormal);
        passwordField.setBorder(BorderFactory.createLineBorder(getBackground().darker(), 2));

        yPadding += 65;

        loginButton = new JButton("Login");
        loginButton.setFont(fontSmall);
        loginButton.setBounds(xOffset, yPadding, widthEnd, 40);
        loginButton.setFont(fontNormal);
        loginButton.setFocusable(false);
        loginButton.setBackground(Color.WHITE);
        loginButton.setBorder(BorderFactory.createLineBorder(getBackground().darker(), 2));
        loginButton.setVerticalAlignment(SwingConstants.BOTTOM);

        loginButton.addActionListener(action());

        add(loginButton);
        add(passwordField);
        add(passwordLabel);
        add(titleLabel);
        add(usernameLabel);
        add(usernameField);

        repaint();
        setVisible(true);
    }

    // Listener / Event for login button.
    ActionListener action() {
        return e -> {

            // If both field texts are correct (admin, admin), dispose login window and initialize ExampleFrame.
            if(usernameField.getText().equals(adminName) && passwordField.getText().equals(adminPassword)) {
                System.out.println("Login success!");

                new ExampleFrame("My Application!", 1000, 650);
                dispose();

                // If both field texts are empty, ask to fill both in.
            } else if(usernameField.getText().equals("") || passwordField.getText().equals(""))
                System.out.println("Please add both username and password.");
            else

                // Else, say the login failed.
                System.out.println("Login failed!");
        };

    }

}
