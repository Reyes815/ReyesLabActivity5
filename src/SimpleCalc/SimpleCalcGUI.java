package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber;
    private JTextField lblResult;
    resultHandler result = new resultHandler();

    public static void main(String[] args) {
        SimpleCalcGUI frame = new SimpleCalcGUI();
        frame.setContentPane(frame.panel1);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(450,250);
        frame.setVisible(true);
    }

    public SimpleCalcGUI(){
        setTitle("Simple Calculator");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class resultHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
