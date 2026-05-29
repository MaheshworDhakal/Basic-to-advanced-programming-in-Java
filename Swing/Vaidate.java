import javax.swing.*;
import java.awt.event.*;

public class Vaidate extends JFrame implements ActionListener {

    JTextField emailt;
    JLabel emaill, jl2;
    JButton ok;

    public Vaidate() {

        // Email label
        emaill = new JLabel("Email:");
        emaill.setBounds(20, 20, 100, 30);

        // Text field
        emailt = new JTextField(20);
        emailt.setBounds(20, 50, 200, 30);

        // Button
        ok = new JButton("Check");
        ok.setBounds(20, 90, 100, 30);
        ok.addActionListener(this);

        // Result label
        jl2 = new JLabel("");
        jl2.setBounds(20, 130, 300, 30);

        // Add components
        add(emaill);
        add(emailt);
        add(ok);
        add(jl2);

        // Frame settings
        setTitle("Email Validator");
        setSize(400, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String email = emailt.getText();

        if (email.indexOf("@") < 0 || email.indexOf(".com") < 0) {
            jl2.setText("Email should contain @ and .com");
        } else {
            jl2.setText("Email is valid!");
        }
    }

    public static void main(String args[]) {
        new Vaidate();
    }
}