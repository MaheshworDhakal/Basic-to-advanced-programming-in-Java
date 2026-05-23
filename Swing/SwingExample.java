import javax.swing.*;
import java.awt.event.*;

public class SwingExample {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Swing Components");

        // Create label
        JLabel label = new JLabel("Enter Name:"); //it is use to display the text or imagge
        label.setBounds(50, 50, 100, 30); //write the given name in the postion in the output

        // Create text field
        JTextField textField = new JTextField();//create the box in which user can take the input 
        textField.setBounds(150, 50, 100, 30);// box bosition (left,top,width,hieght)

        // Create button
        JButton button = new JButton("Show"); //create the clickable button show
        button.setBounds(150, 100, 100, 40);

        // Result label
        JLabel result = new JLabel("Result");//if we make empty the result doesn't wirte in the output
        result.setBounds(50, 150, 100, 30);//result position
        
        //Result text field
            JTextField resultField = new JTextField();
            resultField.setBounds(100, 150, 100, 30);
            

            //above code make the frame textfield label and botton but doesn't process the botton

        // Button click action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Get text from text field
                String name = textField.getText();

                // Show text in label
                result.setText("Hello " + name);
            }
        });

        // Add components
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);
        frame.add(resultField);

        // Frame settings
        frame.setLocationRelativeTo(null);//to show the window in the center
        frame.setSize(400, 300);//size of the window shown after running
        frame.setLayout(null);//to place the components manually in the window using setbound
        frame.setVisible(true);//without this we doesn't see the window 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//without this window closes but program run in background
    }
}