package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel LeapYearChecker;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel LeapYear;

    public static void main(String[] args) {
        LeapYearGUI frame = new LeapYearGUI();
        frame.setContentPane(frame.LeapYear);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setVisible(true);
    }

    public LeapYearGUI() {
       setTitle("Leap Year Checker");
       btnCheckYear.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
       });
    }
}
