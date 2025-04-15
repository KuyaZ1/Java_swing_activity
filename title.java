import javax.swing.*;
import java.awt.*;
import java.awt.Font; // Import the Font class explicitly

public class title extends JFrame {
    public title() {
        // It's better to initialize JFrame using 'this' since this class extends JFrame
        setTitle("Title");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        JRadioButton hueyBtn = new JRadioButton("Huey"); // Corrected spelling
        JRadioButton dueyBtn = new JRadioButton("Duey");
        JRadioButton louieBtn = new JRadioButton("Louie");

        ButtonGroup group = new ButtonGroup(); // Need to create a ButtonGroup instance
        group.add(hueyBtn);
        group.add(dueyBtn);
        group.add(louieBtn);

        hueyBtn.setBounds(20, 20, 60, 20);
        dueyBtn.setBounds(90, 20, 60, 20);
        louieBtn.setBounds(160, 20, 60, 20); // Adjusted position to avoid overlap
        louieBtn.setSelected(true);

        String[] Fonts = {"Monospaced", "SansSerif", "Serif"}; // Corrected variable name to match usage
        JList<String> fontList = new JList<>(Fonts); // Use <> for type inference
        fontList.setSelectedIndex(1);
        JScrollPane scrollPane = new JScrollPane(fontList);
        scrollPane.setBounds(20, 65, 100, 60); // Adjusted height for better visibility

        JLabel nameLabel = new JLabel("Louie");
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 24)); // Use Font.BOLD constant
        nameLabel.setBounds(140, 65, 100, 30);
        nameLabel.setForeground(Color.blue);

        add(hueyBtn); // Use 'add' instead of 'frame.add' since this class is a JFrame
        add(dueyBtn);
        add(louieBtn);
        add(scrollPane);
        add(nameLabel);
    }

    public static void main(String[] args) {
        // Create an instance of your title class to make the frame visible
        SwingUtilities.invokeLater(() -> new title());
    }
}