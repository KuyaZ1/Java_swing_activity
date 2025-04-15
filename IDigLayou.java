import javax.swing.*;
import java.awt.*;

 public class IDigLayou{

	 public static void main (String[] args){

		  JFrame frame = new JFrame("I Dig Layout");

		  frame.setSize(600, 400);
		    frame.setLayout(null);
		         frame.setVisible(true);

JButton button = new JButton("1");
JButton button1 = new JButton("2");
JButton button2 = new JButton("3");
JTextField textField = new JTextField();
JLabel label = new JLabel("Pretty tricky!");
JButton button3 = new JButton("4");
JButton button4 = new JButton("5");
JButton button5 = new JButton("6");
JButton button6 = new JButton("7");
JButton button7 = new JButton("8");

   textField.setBounds(50, 40, 300, 50);
        button.setBounds(0, 40, 50, 50);
        button1.setBounds(0, 0, 350, 40);
        button2.setBounds(0, 90, 350, 45);
        label.setBounds(0, 350, 100, 100);
        label.setForeground(Color.BLACK);
       button3.setBounds(0, 135, 330, 100);
        button4.setBounds(330, 185, 330, 50);
       button5.setBounds(65, 255, 100, 50);
       button6.setBounds(185, 255, 100, 50);
       button7.setBounds(330, 235, 330, 100);

frame.add(button);
frame.add(button1);
frame.add(button2);
frame.add(textField);
frame.add(label);
frame.add(button3);
frame.add(button4);
frame.add(button5);
frame.add(button6);
frame.add(button7);

		 }

		 }