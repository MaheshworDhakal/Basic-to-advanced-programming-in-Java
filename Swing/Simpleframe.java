import javax.swing.*;

public class Simpleframe {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Maheshwor Dhakal");//write the title of the frame

        // Create button
        JButton button = new JButton("Click Me");//crate th bottom name click name
        button.setBounds(100, 100, 120, 40);

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(400, 300);
       // frame.setLayout(null);//for the center 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}