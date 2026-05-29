import javax.swing.*;
import java.awt.event.*;

public class ALLcomponents extends JFrame implements ActionListener
{
    JTextField namet, addresst;

    JLabel namel, addressl, collegel, facultyl, teacherl;

    JRadioButton f1, f2, f3, f4;

    JCheckBox teacher;

    JComboBox<String> college;

    JButton OK;

    ALLcomponents()
    {
        // TextField
        namet = new JTextField();
        namet.setBounds(120, 50, 200, 30);

        addresst = new JTextField();
        addresst.setBounds(120, 100, 200, 30);

        // Labels
        namel = new JLabel("Name:");
        namel.setBounds(20, 50, 100, 30);

        addressl = new JLabel("Address:");
        addressl.setBounds(20, 100, 100, 30);

        collegel = new JLabel("College:");
        collegel.setBounds(20, 150, 100, 30);

        facultyl = new JLabel("Faculty:");
        facultyl.setBounds(20, 200, 100, 30);

        teacherl = new JLabel("Teacher:");
        teacherl.setBounds(20, 300, 100, 30);

        // ComboBox
        String colleges[] = {
                "Cosmos College of Management and Technology",
                "Nepal Engineering College",
                "Nepal College of Information Technology",
                "Everest College"
        };

        college = new JComboBox<>(colleges);
        college.setBounds(120, 150, 250, 30);

        // Radio Buttons
        f1 = new JRadioButton("Computer");
        f2 = new JRadioButton("Civil");
        f3 = new JRadioButton("IT");
        f4 = new JRadioButton("Architecture");

        f1.setBounds(120, 200, 100, 30);
        f2.setBounds(220, 200, 100, 30);
        f3.setBounds(120, 240, 100, 30);
        f4.setBounds(220, 240, 120, 30);

        // Button Group
        ButtonGroup bg = new ButtonGroup();
        bg.add(f1);
        bg.add(f2);
        bg.add(f3);
        bg.add(f4);

        // CheckBox
        teacher = new JCheckBox("Class Teacher");
        teacher.setBounds(120, 300, 150, 30);

        // Button
        OK = new JButton("OK");
        OK.setBounds(150, 360, 100, 30);

        OK.addActionListener(this);

        // Add Components
        add(namet);
        add(addresst);

        add(namel);
        add(addressl);
        add(collegel);
        add(facultyl);
        add(teacherl);

        add(college);

        add(f1);
        add(f2);
        add(f3);
        add(f4);

        add(teacher);

        add(OK);

        // Frame Settings
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Action Event
    public void actionPerformed(ActionEvent e)
    {
        String name = namet.getText();

        String selectedCollege = (String) college.getSelectedItem();

        // Display only if college is Cosmos
        if(selectedCollege.equals("Cosmos College of Management and Technology"))
        {
            JOptionPane.showMessageDialog(this,
                    "Student Name: " + name);
        }
        else
        {
            JOptionPane.showMessageDialog(this,
                    "Student is not from Cosmos College");
        }
    }

    // Main Method
    public static void main(String[] args)
    {
        new ALLcomponents();
    }
}