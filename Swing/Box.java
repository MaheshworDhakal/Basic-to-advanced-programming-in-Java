import javax.swing.*;
import java.awt.*;

public class Box {

    public static void main(String[] args) {

        JFrame frame = new JFrame("BoxLayout Example");

        JPanel panel = new JPanel();

        // Set BoxLayout vertically
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}