import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener {

    JTextField display;
    JButton[] buttons;
    String[] buttonLabels = {
            "AC", "()", "%", "/",
            "7", "8", "9", "x",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "="
    };

    String currentInput = "";
    double firstOperand = 0;
    String operator = "";

    Calculator() {
        setTitle("Calculator");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setBounds(50, 50, 400, 50);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display);

        buttons = new JButton[buttonLabels.length];
        int x = 50, y = 150;
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setBounds(x, y, 90, 80);
            buttons[i].addActionListener(this);
            add(buttons[i]);
            x += 100;
            if (x > 400) {
                x = 50;
                y += 90;
            }
        }
        buttons[3].setBackground(Color.ORANGE);
        buttons[7].setBackground(Color.ORANGE);
        buttons[11].setBackground(Color.ORANGE);
        buttons[15].setBackground(Color.ORANGE);
        buttons[18].setBackground(Color.CYAN);
        buttons[0].setBackground(Color.LIGHT_GRAY);
        buttons[1].setBackground(Color.LIGHT_GRAY);
        buttons[2].setBackground(Color.LIGHT_GRAY);

        for (int i = 4; i <= 17; i++){
            if (i == 7 || i == 11 || i == 15){
                continue;
            }
            buttons[i].setBackground(Color.BLACK);
            buttons[i].setForeground(Color.WHITE);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("AC")) {
            currentInput = "";
            firstOperand = 0;
            operator = "";
            display.setText("");
        } else if (command.equals("=")) {
            try {
                double secondOperand = Double.parseDouble(currentInput);
                double result = calculate(firstOperand, secondOperand, operator);
                display.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else if (command.equals("+") || command.equals("-") || command.equals("x") || command.equals("/")) {
            try {
                firstOperand = Double.parseDouble(currentInput);
                operator = command;
                currentInput = "";
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else if (command.equals("%")){
            try {
                double currentValue = Double.parseDouble(currentInput);
                currentValue = currentValue / 100;
                currentInput = String.valueOf(currentValue);
                display.setText(currentInput);
            } catch (NumberFormatException ex){
                display.setText("Error");
            }

        } else if (command.equals("()")){

            if (currentInput.contains("(")){
                currentInput += ")";
            } else {
                currentInput += "(";
            }

            display.setText(currentInput);

        } else {
            currentInput += command;
            display.setText(currentInput);
        }
    }

    double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}