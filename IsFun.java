import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IsFun {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel l1, l2, l3;
    JTextField tf;

    IsFun() {
        JFrame frame = new JFrame();
        frame.setTitle("335 is fun");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLayout(null);

        b1 = new JButton("1");
        b1.setBounds(30, 15, 50, 30);
        b2 = new JButton("2");
        b2.setBounds(85, 0, 50, 30);
        b3 = new JButton("3");
        b3.setBounds(85, 31, 50, 30);
        b4 = new JButton("4");
        b4.setBounds(136, 0, 50, 30);
        b5 = new JButton("5");
        b5.setBounds(136, 31, 50, 30);
        b6 = new JButton("6");
        b6.setBounds(190, 15, 50, 30);
        b7 = new JButton("7");
        b7.setBounds(245, 15, 50, 30);
        b8 = new JButton("8");
        b8.setBounds(0, 70, 350, 110);
        b9 = new JButton("9");
        b9.setBounds(0, 181, 350, 110);
        l1 = new JLabel("Label 1");
        l1.setBounds(0, 290, 60, 28);
        l2 = new JLabel("Label 2");
        l2.setBounds(350, 290, 60, 27);
        l3 = new JLabel("Label 3");
        l3.setBounds(350, 165, 60, 28);
        tf = new JTextField();
        tf.setBounds(50,293, 300, 20);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(tf);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new IsFun();
    }
}