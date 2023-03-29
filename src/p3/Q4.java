package p3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Q4 extends JFrame {

    private JPanel inputPanel = new JPanel(new GridLayout(0, 2));
    private JPanel outputPanel = new JPanel();
    private JPasswordField passwordField = new JPasswordField();
    private JButton submitBtn = new JButton("Submit");
    private JTextArea outputJTextArea = new JTextArea();
    private String passwordStr;

    public Q4() {
        setLayout(new BorderLayout());
        inputPanel.add(new JLabel("Enter your password : "));
        inputPanel.add(passwordField);
        inputPanel.add(new JLabel());

        //Button ActionListner
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Password pw = new Password(passwordField.getText());

                    outputJTextArea.setText("Congratulations! Your password is valid");
                    outputJTextArea.setForeground(Color.blue);
                } catch (InvalidPasswordException ex) {
                    String errorMsg = ex.getMessage();
                    outputJTextArea.setText(errorMsg);
                    outputJTextArea.setForeground(Color.red);

                }
            }

        });

        //==============================================
        inputPanel.add(submitBtn);

        add(inputPanel, BorderLayout.NORTH);

        outputJTextArea.setText("hello");
        outputJTextArea.setEditable(false);
        outputPanel.add(outputJTextArea);
        outputPanel.setBackground(Color.white);
        add(outputPanel, BorderLayout.CENTER);

        setSize(400, 200);
        setTitle("Display: Show Bounds Error");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
