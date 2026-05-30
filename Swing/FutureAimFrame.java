package Swing;
import javax.swing.*;
import java.awt.event.*;

public class FutureAimFrame extends JFrame implements ActionListener {

    JComboBox<String> aimBox;
    JButton next;
    JLabel label;

    FutureAimFrame() {

        setTitle("Future Aim");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        label = new JLabel("Select Your Future Aim:");
        label.setBounds(50, 30, 200, 25);

        aimBox = new JComboBox<>(new String[]{
            "Software Engineer",
            "Doctor",
            "Pilot"
        });
        aimBox.setBounds(50, 70, 200, 25);

        next = new JButton("Next");
        next.setBounds(50, 120, 100, 30);
        next.addActionListener(this);

        add(label);
        add(aimBox);
        add(next);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String selectedAim = (String) aimBox.getSelectedItem();

        new RoadmapFrame(selectedAim); // pass data to 3rd frame
        dispose(); // close current frame
    }
}