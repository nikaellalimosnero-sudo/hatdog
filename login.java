package gui;
import javax.swing.*;
import java.awt.*;

public class login {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Log in");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(new JLabel(new ImageIcon("C://Users//Student//Downloads//library.jpg")));
        frame.setLayout(new GridBagLayout());
        
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setPreferredSize(new Dimension(600, 400));
        loginPanel.setBackground(new Color(80, 30, 20));
        loginPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(90, 60, 30), 2),
                "Login Panel", 0, 0,
                new Font("Century Schoolbook", Font.BOLD, 22),
                new Color(218, 165, 32)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Bookkeeper: Tracking Books Made Easy", JLabel.CENTER);
        titleLabel.setForeground(new Color(218, 165, 32));
        titleLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 22));

        JLabel userLabel = new JLabel("Username:", new ImageIcon("user_icon.png"), JLabel.LEFT);
        userLabel.setForeground(new Color(245, 222, 179));
        JTextField userField = new JTextField(20);
        userField.setFont(new Font("Arial", Font.PLAIN, 16));
        userField.setPreferredSize(new Dimension(220, 35));

        JLabel passLabel = new JLabel("Password:", new ImageIcon("lock_icon.png"), JLabel.LEFT);
        passLabel.setForeground(new Color(245, 222, 179));
        JPasswordField passField = new JPasswordField(20);
        passField.setFont(new Font("Arial", Font.PLAIN, 16));
        passField.setPreferredSize(new Dimension(220, 35));

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(60, 90, 150));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginButton.setPreferredSize(new Dimension(160, 40));

        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFont(new Font("Arial", Font.BOLD, 18));
        exitButton.setPreferredSize(new Dimension(160, 40));

        loginButton.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            JOptionPane.showMessageDialog(frame,
                    (user.equals("admin") && pass.equals("1234"))
                            ? "Login Successful! Welcome to the Bookkeeper."
                            : "Invalid Username or Password.",
                    (user.equals("admin") && pass.equals("1234")) ? "Success" : "Error",
                    (user.equals("admin") && pass.equals("1234")) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
        });
        exitButton.addActionListener(e -> System.exit(0));

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; loginPanel.add(titleLabel, gbc);
        gbc.gridwidth = 1; gbc.gridx = 0; gbc.gridy = 1; loginPanel.add(userLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; loginPanel.add(userField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; loginPanel.add(passLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 2; loginPanel.add(passField, gbc);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2; loginPanel.add(loginButton, gbc);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; loginPanel.add(exitButton, gbc);

        frame.add(loginPanel);
        frame.setVisible(true);
    }
}     
        

