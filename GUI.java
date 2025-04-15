import javax.swing.*;
import java.awt.*;

public class GUIFrames {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame1 = createFrame1();
        JFrame frame2 = createFrame2();
        JFrame frame3 = createFrame3();
        JFrame frame4 = createFrame4();
        JFrame frame5 = createFrame5();
        JFrame frame6 = createFrame6();

        // Arrange frames (example: side-by-side)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns
        mainPanel.add(frame1);
        mainPanel.add(frame2);
        mainPanel.add(frame3);
        mainPanel.add(frame4);
        mainPanel.add(frame5);
        mainPanel.add(frame6);

        JFrame mainFrame = new JFrame("All Frames");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private static JFrame createFrame1() {
        JFrame frame = new JFrame("Buttons");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 3)); // 8 rows, 3 columns

        panel.add(new JCheckBox("Bold"));
        panel.add(new JLabel("long name"));
        panel.add(new JLabel("")); // Empty label

        panel.add(new JCheckBox("Italic"));
        panel.add(new JLabel("1"));
        panel.add(new JLabel("2"));

        panel.add(new JCheckBox("Underline"));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        panel.add(new JCheckBox("Strikeout"));
        panel.add(new JLabel("3"));
        panel.add(new JLabel("4"));

        panel.add(new JLabel(""));
        panel.add(new JLabel("5"));
        panel.add(new JLabel("6"));

        panel.add(new JLabel(""));
        panel.add(new JButton("Cancel"));
        panel.add(new JLabel(""));

        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel("7"));

        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        frame.getContentPane().add(panel);
        frame.pack();
        return frame;
    }

    // Similar methods for createFrame2(), createFrame3(), ..., createFrame6()
    // (You'll need to fill in the details based on the human-readable description)

    private static JFrame createFrame2() {
        JFrame frame = new JFrame("Something I Studied");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3)); // Adjust as needed

        panel.add(new JButton("Button1"));
        panel.add(new JButton("Button2"));
        panel.add(new JButton("Button3"));

        panel.add(new JButton("Button4"));
        panel.add(new JButton("Button5"));
        panel.add(new JButton("Button6"));

        panel.add(new JButton("Button7"));
        panel.add(new JButton("Button8"));
        panel.add(new JButton("Button9"));

        panel.add(new JTextField("Type stuff"));
        panel.add(new JLabel("")); // Empty label
        panel.add(new JLabel("")); // Empty label

        frame.getContentPane().add(panel);
        frame.pack();
        return frame;
    }

    // ... (createFrame3, createFrame4, createFrame5, createFrame6)

}