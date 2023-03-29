package Lab_4;

import javax.swing.*;

public class OwnerValidation {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String output = "Nathaniel P. Rijndorp";
        String name = JOptionPane.showInputDialog(null, new JTextArea("Insert name: "), output, 1);

        if (name.equalsIgnoreCase("anne" ) || name.equalsIgnoreCase("mart")) {
            JOptionPane.showMessageDialog(null, new JTextArea(name + " is the owner."), output,1);
        } else {
            JOptionPane.showMessageDialog(null, new JTextArea(name + " is the owner of nothing."), output, 1);
        }
    }
}
