package Lab_4;

import javax.swing.*;

public class  PositiveNegative {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String name = "Nathaniel P. Rijndorp";
        float input = Float.parseFloat(JOptionPane.showInputDialog("Enter value: "));
        if (input == 0) {
            JOptionPane.showMessageDialog(null, new JTextArea(name + "\nThis number is neither positive nor negative."));
            } else if (input > 0) {
            JOptionPane.showMessageDialog(null, new JTextArea(name + "\nThis number is positive"));
            } else {
            JOptionPane.showMessageDialog(null, new JTextArea(name + "\nThis number is negative"));
            }
    }
}
