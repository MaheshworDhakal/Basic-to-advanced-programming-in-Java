import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AttemptSwing extends JFrame implements ActionListener {

    JLabel l1, rl1, rl2;
    JButton ok;
    JRadioButton r1, r2;

    public AttemptSwing() {

        // Frame settings
        setTitle("Best Wishes");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        l1 = new JLabel("Attempt All Questions:");
        l1.setBounds(20, 20, 200, 30);

        rl1 = new JLabel("Pass:");
        rl1.setBounds(50, 200, 100, 30);

        rl2 = new JLabel("Fail:");
        rl2.setBounds(50, 250, 100, 30);

        r1 = new JRadioButton("Pass");
        r1.setBounds(150, 200, 100, 30);

        r2 = new JRadioButton("Fail");
        r2.setBounds(150, 250, 100, 30);

        ok = new JButton("Show");
        ok.setBounds(100, 320, 100, 40);

        // Button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // Add components
        add(l1);
        add(rl1);
        add(rl2);
        add(r1);
        add(r2);
        add(ok);

        // Action listener
        ok.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (r1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Pass Selected");
        }

        else if (r2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Fail Selected");
        }

        else {
            JOptionPane.showMessageDialog(this, "Please select an option");
        }
    }

    public static void main(String arg[]) {
        new AttemptSwing();
    }
}