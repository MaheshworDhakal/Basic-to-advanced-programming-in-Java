import javax.swing.*;
import java.awt.*;

public class Cardlayouteg {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        CardLayout cl = new CardLayout();
        JPanel panel = new JPanel(cl);

        panel.add(new JButton("Card 1"), "1");
        panel.add(new JButton("Card 2"), "2");

        cl.show(panel, "2");

        frame.add(panel);
        frame.setTitle("Card Layouy");

        frame.setSize(300,200);
        frame.setVisible(true);
    }
}