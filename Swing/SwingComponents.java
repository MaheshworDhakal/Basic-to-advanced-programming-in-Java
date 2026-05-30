package Swing;
import javax.swing.*;
import java.awt.event.*;
public class SwingComponents extends JFrame implements ActionListener
{
    JTextField namet;
    JRadioButton mr,fr,nr;
    JCheckBox cl1,cl2,cl3;
    JComboBox <String> c1;
    JLabel namel,genderl,languagel,educationl;
    JButton ok;
    SwingComponents()
    {
        //Frame setting 
        setTitle("Swing Components");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //making components
        namel=new JLabel("Name:");
        namet= new JTextField(10);
        genderl=new JLabel("Gender:");
        mr=new JRadioButton("Male");
        fr=new JRadioButton("Female");
        nr=new JRadioButton("Not Specified ");
        languagel=new JLabel("Language");
        cl1=new JCheckBox("English");
        cl2=new JCheckBox("nepali");
        cl3=new JCheckBox("Japanese");
        ButtonGroup bg=new ButtonGroup();
        bg.add(mr);
        bg.add(fr);
        bg.add(nr);
        c1=new JComboBox(new String[]{"+2","SEE","Bachelor"});
        educationl=new JLabel("Education");
        ok=new JButton("Done");
        ok.addActionListener(this);
        
        
        
        

        //placing the components in correct place
        namel.setBounds(20,20,80,25);
namet.setBounds(100,20,150,25);

genderl.setBounds(20,60,80,25);
mr.setBounds(100,60,80,25);
fr.setBounds(180,60,80,25);
nr.setBounds(260,60,120,25);

languagel.setBounds(20,100,80,25);
cl1.setBounds(100,100,80,25);
cl2.setBounds(180,100,80,25);
cl3.setBounds(260,100,100,25);

educationl.setBounds(20,140,80,25);
c1.setBounds(100,140,120,25);

ok.setBounds(100,190,100,30);
        //adding components
        add(namel);
        add(namet);
        add(mr);
        add(fr);
        add(nr);
        add(languagel);
        add(genderl);
        add(cl1);
        add(cl2);
        add(cl3);
        add(educationl);
        add(c1);
        add(ok);
    }
    public void actionPerformed(ActionEvent e)
    {
        
    new FutureAimFrame();
    dispose();
}
    
    public static void main(String args[])
    {
        new SwingComponents();
    }

} 