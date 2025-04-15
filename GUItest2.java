import java.awt.*;
import javax.swing.*;

class GUItest2{

public static void main (String[] args){

 JFrame frame = new JFrame("Good thing I studied!");

 frame.setSize(1000, 1100);
   frame.setLayout(null);
        frame.setVisible(true);

JButton button = new JButton("Button1");
JButton button1 = new JButton("Button2");
JButton button2 = new JButton("Button3");
JButton button3 = new JButton("Button4");
JButton button4 = new JButton("Button5");
JButton button5 = new JButton("Button6");
JButton button6 = new JButton("Button7");

button.setBounds(0,0,118,30);
button1.setBounds(118,0,118,30);
button2.setBounds(236,0,119,30);
button3.setBounds(0,30,177,100);
button4.setBounds(177,30,178,100);
button5.setBounds(0,130,177,100);
button6.setBounds(177,130,178,100);


JTextField textField = new JTextField();
textField.setBounds(150,240,178,30);

JLabel label = new JLabel("Type stuff:");
label.setBounds(78,240,80,30);
label.setForeground(Color.blue);

frame.add(button);
frame.add(button1);
frame.add(button2);
frame.add(button3);
frame.add(button4);
frame.add(button5);
frame.add(button6);
frame.add(textField);
frame.add(label);
}
}
