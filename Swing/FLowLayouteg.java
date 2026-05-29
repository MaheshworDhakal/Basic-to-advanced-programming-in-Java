import javax.swing.*;
import java.awt.*;

public class FLowLayouteg {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());

        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));

        frame.setSize(300, 200);frame.setTitle("FLow Layout");

        frame.setVisible(true);
    }
}