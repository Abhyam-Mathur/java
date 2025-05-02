// File: CalculatorSwing.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField text = new JTextField();
        text.setBounds(30, 40, 280, 30);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        JPanel panel = new JPanel();
        panel.setBounds(30, 80, 280, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        for (String btnText : buttons) {
            JButton btn = new JButton(btnText);
            panel.add(btn);

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();
                    if (cmd.equals("C")) {
                        text.setText("");
                    } else if (cmd.equals("=")) {
                        try {
                            text.setText("" + eval(text.getText()));
                        } catch (Exception ex) {
                            text.setText("Error");
                        }
                    } else {
                        text.setText(text.getText() + cmd);
                    }
                }
            });
        }

        frame.add(text);
        frame.add(panel);
        frame.setSize(350, 450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static int eval(String expr) {
        return (int) new javax.script.ScriptEngineManager()
            .getEngineByName("JavaScript")
            .eval(expr);
    }
}
