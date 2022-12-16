package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame implements ActionListener{
    private JPanel panel1;
    private JButton orderButton;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
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
        rbNone.addActionListener(this);
        rb5.addActionListener(this);
        rb10.addActionListener(this);
        rb15.addActionListener(this);
        cPizza.addActionListener(this);
        cFries.addActionListener(this);
        cBurger.addActionListener(this);
        cSoftDrinks.addActionListener(this);
        cTea.addActionListener(this);
        cSundae.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== rbNone) {
            disc = 0;
        } else if (e.getSource()== rb5) {
            disc = 0.05;
        } else if (e.getSource()== rb10) {
            disc = 0.10;
        } else if (e.getSource()== rb15) {
            disc = 0.15;
        } else if (e.getSource()== cBurger) {
            total = total + 80.00;
        } else if (e.getSource()== cPizza) {
            total = total + 100.00;
        } else if (e.getSource()== cFries) {
            total = total + 65.00;
        } else if (e.getSource()== cSoftDrinks) {
            total = total + 55.00;
        } else if (e.getSource()== cSundae) {
            total = total + 40.00;
        } else if (e.getSource()== cTea) {
            total = total + 50.00;
        }
    }



    public class orderHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"The total price is Php " + (total - (total * disc)) );
        }
    }



}
