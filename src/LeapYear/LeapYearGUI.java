package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel LeapYearChecker;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel LeapYear;
    inpHandler handler = new inpHandler();


    public static void main(String[] args) {
        LeapYearGUI frame = new LeapYearGUI();
        frame.setContentPane(frame.LeapYear);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(450,250);
        frame.setVisible(true);
    }


    public LeapYearGUI() {
        setTitle("Leap Year Checker");
        btnCheckYear.addActionListener(handler);

    }


    public class inpHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inp = tfYear.getText();
            String leap = "Leap year";
            String notleap = "Not a leap year";

            try {
                double numYear = Double.parseDouble(inp);

                tfYear.setText("");
                if (((numYear % 4 == 0) && (numYear % 100 != 0)) || (numYear % 400 == 0)) {
                    JOptionPane.showMessageDialog(null, leap);
                } else {
                    JOptionPane.showMessageDialog(null, notleap);
                }

            } catch (NumberFormatException x) {
                System.out.println();
            }
        }
    }
}
