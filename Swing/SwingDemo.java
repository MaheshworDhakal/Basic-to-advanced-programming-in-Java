import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingDemo extends JFrame implements ActionListener{

    JLabel l1;
    JRadioButton r1,r2;
    JButton ok;
   public  SwingDemo()
   {
    l1=new JLabel("select color:");

    r1=new JRadioButton("Red");

    r2=new JRadioButton("Green");

    ok=new JButton("Select");

    ButtonGroup bg=new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    add(r1);add(r2);
    add(l1);
    add(ok);
    ok.addActionListener(this);
    //frame setting 
    setTitle("Swing Demo");
    setSize(600,600);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    // set positions
        l1.setBounds(50, 50, 100, 30);
        r1.setBounds(50, 100, 100, 30);
        r2.setBounds(50, 150, 100, 30);
        ok.setBounds(50, 200, 100, 30);

   }
    public void actionPerformed(ActionEvent e )
   {
      if (r1.isSelected()) {
            getContentPane().setBackground(Color.RED);
        } 
        else if (r2.isSelected()) {
            getContentPane().setBackground(Color.GREEN);
        }

   }
   public static void main(String  args[])
   {
    new SwingDemo();
   }
}