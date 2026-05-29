import javax.swing.*;

public class Menueg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add items to menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);

        // Set menu bar to frame
        frame.setJMenuBar(menuBar);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}