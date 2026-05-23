import javax.swing.*;
import java.awt.event.*;

public class ADDSwing extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b;

    ADDSwing() {

        // Labels
        l1 = new JLabel("Enter first num:");
        l1.setBounds(10, 50, 120, 30);

        l2 = new JLabel("Enter second num:");
        l2.setBounds(10, 100, 130, 30);

        l3 = new JLabel("Result:");
        l3.setBounds(10, 200, 100, 30);

        // Text fields
        t1 = new JTextField();
        t1.setBounds(140, 50, 120, 30);

        t2 = new JTextField();
        t2.setBounds(140, 100, 120, 30);

        t3 = new JTextField();
        t3.setBounds(140, 200, 120, 30);
        t3.setEditable(false);

        // Button
        b = new JButton("Add");
        b.setBounds(100, 150, 80, 30);

        // Action listener
        b.addActionListener(this);

        // Add components
        add(l1);
        add(l2);
        add(l3);

        add(t1);
        add(t2);
        add(t3);

        add(b);

        // Frame settings
        setTitle("Addition Program");
        setSize(320, 320);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Button click event
    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum = num1 + num2;

        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new ADDSwing();
    }
}