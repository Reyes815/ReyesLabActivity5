package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame implements ActionListener{
    private JPanel panel1;
    private JButton orderButton;
    private JCheckBox pizzaCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    orderHandler handler = new orderHandler();
    double disc = 0;
    double total = 0;

    public static void main(String[] args) {
        FoodOrderGUI frame = new FoodOrderGUI();
        frame.setContentPane(frame.panel1);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public FoodOrderGUI() {
        setTitle("Food Ordering System");
        orderButton.addActionListener(handler);
        noneRadioButton.addActionListener(this);
        a5OffRadioButton.addActionListener(this);
        a10OffRadioButton.addActionListener(this);
        a15OffRadioButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==noneRadioButton) {
            disc = 1;
        } else if (e.getSource()==a5OffRadioButton) {
            disc = 0.05;
        } else if (e.getSource()==a10OffRadioButton) {
            disc = 0.10;
        } else if (e.getSource()==a15OffRadioButton) {
            disc = 0.15;
        }
    }

    public class orderHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"The total price is Php " + disc);
        }
    }



}
