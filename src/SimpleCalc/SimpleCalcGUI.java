package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber;
    private JTextField lblResult;
    resultHandler result = new resultHandler();
    int total = 0;
    String operation;

    public static void main(String[] args) {
        SimpleCalcGUI frame = new SimpleCalcGUI();
        frame.setContentPane(frame.panel1);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(600,250);
        frame.setVisible(true);
    }

    public SimpleCalcGUI(){
        setTitle("Simple Calculator");
        btnCompute.addActionListener(result);

        cbOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = (String) cbOperations.getSelectedItem();
            }
        });
    }


    public class resultHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String inp1 = tfNumber1.getText();
            String inp2 = tfNumber.getText();
            try {
                int num1 = Integer.parseInt(inp1);
                int num2 = Integer.parseInt(inp2);
                if (operation.equals("+")){
                    total = num1 + num2;
                } else if (operation.equals("-")){
                    total = num1 - num2;
                } else if (operation.equals("*")){
                    total = num1 * num2;
                } else if (operation.equals("/")){
                    total = num1 / num2;
                }
            } catch (NumberFormatException x) {
                System.out.println();
            }
            String str = total+"";
            lblResult.setText(str);
            tfNumber.setText("");
            tfNumber1.setText("");
        }
    }
}
