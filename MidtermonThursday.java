import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class MidtermonThursday {
JButton bnow,bmed,blib,bhelp,bser,bok,b1,b2,b3,b4;
JTextField tf;
JRadioButton bmo,bmu,bvi,bdv,bwe;
    MidtermonThursday(){
        JFrame frame = new JFrame();
        frame.setTitle("335 Midterm on Thursday");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);

        bnow = new JButton("Now Playing");
        bnow.setBounds(0, 0, 120, 30);

        bmed = new JButton("Media Guide");
        bmed.setBounds(0, 31, 120, 30);

        blib = new JButton("Library");
        blib.setBounds(0, 62, 80, 30);

        bhelp = new JButton("Help & Info");
        bhelp.setBounds(0, 93, 110, 30);

        bser = new JButton("Services");
        bser.setBounds(0, 124, 90, 30);

        bok = new  JButton("OK");
        bok.setBounds(350, 61, 90, 188);

        tf = new JTextField();
        tf.setBounds(120, 0, 230, 250);

        b1 = new JButton("0");
        b1.setBounds(350, 0, 45, 30);
        b2 = new JButton("1");
        b2.setBounds(396, 0, 45, 30);
        b3 = new JButton("2");
        b3.setBounds(350, 31, 45, 30);
        b4 = new JButton("3");
        b4.setBounds(396, 31, 45, 30);

        bmo = new JRadioButton("Movies");
        bmo.setBounds(30, 250, 70, 30);
        bmu = new JRadioButton("Music");
        bmu.setBounds(110, 250, 70, 30);
        bvi = new JRadioButton("Videos");
        bvi.setBounds(180, 250, 70, 30);
        bdv = new JRadioButton("DVD");
        bdv.setBounds(250, 250, 60, 30);
        bwe = new JRadioButton("Web Pages");
        bwe.setBounds(310, 250, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(bmo);
        group.add(bmu);
        group.add(bvi);
        group.add(bdv);
        group.add(bwe);

        frame.add(bnow);
        frame.add(bmed);
        frame.add(blib);
        frame.add(bhelp);
        frame.add(bser);
        frame.add(bok);
        frame.add(tf);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(bmo);
        frame.add(bmu);
        frame.add(bvi);
        frame.add(bdv);
        frame.add(bwe);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new MidtermonThursday();
    }
}