package Swing;
import javax.swing.*;

public class RoadmapFrame extends JFrame {

    JTextArea area;

    RoadmapFrame(String aim) {

        setTitle("Roadmap for " + aim);
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        area = new JTextArea();
        area.setBounds(20, 20, 440, 300);
        area.setEditable(false);

        // Roadmap logic
        if (aim.equals("Software Engineer")) {
            area.setText(
                "Software Engineer Roadmap:\n\n" +
                "1. Learn Java / Python\n" +
                "2. Data Structures & Algorithms\n" +
                "3. Build Projects\n" +
                "4. Learn Git & GitHub\n" +
                "5. Apply for Internship"
            );
        }
        else if (aim.equals("Doctor")) {
            area.setText(
                "Doctor Roadmap:\n\n" +
                "1. Focus on Biology & Chemistry\n" +
                "2. Prepare for NEET or entrance exam\n" +
                "3. Medical College (MBBS)\n" +
                "4. Internship in hospital\n" +
                "5. Specialization"
            );
        }
        else if (aim.equals("Pilot")) {
            area.setText(
                "Pilot Roadmap:\n\n" +
                "1. Strong Physics & Math\n" +
                "2. Join aviation school\n" +
                "3. Flight training hours\n" +
                "4. Obtain pilot license\n" +
                "5. Commercial flying experience"
            );
        }
        else {
            area.setText("No roadmap available.");
        }

        add(area);

        setVisible(true);
    }
}