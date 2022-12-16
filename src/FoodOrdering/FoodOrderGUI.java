package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JButton orderButton;
    private JCheckBox pizzaCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    orderHandler handler = new orderHandler();

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
    }

    public class orderHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"The total price is Php ");
        }
    }

}
