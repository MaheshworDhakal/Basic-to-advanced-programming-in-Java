import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CompareTextFieldsSwing extends JFrame
        implements ActionListener {

    JTextField tf1, tf2;
    JButton btn;
    JPanel panel;

    CompareTextFieldsSwing() {

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        tf1 = new JTextField();
        tf2 = new JTextField();
        btn = new JButton("Check");

        panel.add(tf1);
        panel.add(tf2);
        panel.add(btn);

        add(panel);

        btn.addActionListener(this);

        setTitle("Color Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        Color c;

        if (tf1.getText().equals(tf2.getText())) {
            c = Color.GREEN;
        } else {
            c = Color.RED;
        }

        // Change all component colors
        panel.setBackground(c);
        tf1.setBackground(c);
        tf2.setBackground(c);
        btn.setBackground(c);
    }

    public static void main(String[] args) {
        new CompareTextFieldsSwing();
    }
}