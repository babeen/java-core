/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Calculator extends JFrame implements ActionListener{
    private final JTextField display;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;
    private final JButton button9;
    private final JButton button0;
    private final JButton buttonAdd;
    private final JButton buttonSubtract;
    private final JButton buttonMultiply;
    private final JButton buttonDivide;
    private final JButton buttonEquals;
    private final JButton buttonClear;
    private double num1 = 0, num2 = 0, result = 0;
    private int operator = 0;
    /**
     */
    // Constructor to initialize the GUI components
    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setResizable(false);
    
    // Create a new JPanel to hold the display and buttons
        JPanel panel = new JPanel(new BorderLayout());
        display = new JTextField("0");
        display.setEditable(false);
        panel.add(display, BorderLayout.NORTH);
        
        
    // Create the number buttons
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        
    // Create the operator buttons
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");
        
    // Add the buttons to the panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonAdd);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonClear);
        buttonPanel.add(button0);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonDivide);
        panel.add(buttonPanel, BorderLayout.CENTER);
        
    // Add the action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);
        
         // Add the panel to the frame
        add(panel);
        setVisible(true);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            display.setText(display.getText() + "1");
        } else if (e.getSource() == button2) {
            display.setText(display.getText() + "2");
        } else if (e.getSource() == button3) {
            display.setText(display.getText() + "3");
                    }else if (e.getSource() == button4) {
display.setText(display.getText() + "4");
} else if (e.getSource() == button5) {
display.setText(display.getText() + "5");
} else if (e.getSource() == button6) {
display.setText(display.getText() + "6");
} else if (e.getSource() == button7) {
display.setText(display.getText() + "7");
} else if (e.getSource() == button8) {
display.setText(display.getText() + "8");
} else if (e.getSource() == button9) {
display.setText(display.getText() + "9");
} else if (e.getSource() == button0) {
display.setText(display.getText() + "0");
} else if (e.getSource() == buttonAdd) {
num1 = Double.parseDouble(display.getText());
operator = 1;
display.setText("");
} else if (e.getSource() == buttonSubtract) {
num1 = Double.parseDouble(display.getText());
operator = 2;
display.setText("");
} else if (e.getSource() == buttonMultiply) {
num1 = Double.parseDouble(display.getText());
operator = 3;
display.setText("");
} else if (e.getSource() == buttonDivide) {
num1 = Double.parseDouble(display.getText());
operator = 4;
display.setText("");
} else if (e.getSource() == buttonClear) {
num1 = 0;
num2 = 0;
result = 0;
operator = 0;
display.setText("");
} else if (e.getSource() == buttonEquals) {
num2 = Double.parseDouble(display.getText());
switch (operator) {
case 1:
result = num1 + num2;
break;
case 2:
result = num1 - num2;
break;
case 3:
result = num1 * num2;
break;
case 4:
result = num1 / num2;
break;
default:
result = 0;
break;
}
display.setText(Double.toString(result));
num1 = 0;
num2 = 0;
result = 0;
operator = 0;
}        
        }
    
    public static void main(String[] args) {
    new Calculator();
}
    
}
