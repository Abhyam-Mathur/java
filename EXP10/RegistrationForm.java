// File: RegistrationForm.java
import javax.swing.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 150, 30);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 70, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 70, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 110, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 110, 150, 30);

        JLabel confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setBounds(20, 150, 150, 30);
        JPasswordField confirmField = new JPasswordField();
        confirmField.setBounds(150, 150, 150, 30);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 190, 100, 30);

        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(50, 230, 300, 30);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                messageLabel.setText("All fields must be filled.");
            } else if (!email.contains("@")) {
                messageLabel.setText("Invalid email address.");
            } else if (!pass.equals(confirm)) {
                messageLabel.setText("Passwords do not match.");
            } else {
                messageLabel.setText("Registration successful!");
            }
        });

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmLabel); frame.add(confirmField);
        frame.add(registerButton); frame.add(messageLabel);

        frame.setSize(400, 330);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
