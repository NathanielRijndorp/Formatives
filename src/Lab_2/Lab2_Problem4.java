package Lab_2;

import javax.swing.*;

public class Lab2_Problem4 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String flash = JOptionPane.showInputDialog(null, "Enter amount of flash drives: ");
        int n = Integer.parseInt(flash);
        int gross = n / 144;
        int remainder = n % 144;
        int dozen = remainder / 12;
        int extra = remainder % 12;
        JOptionPane.showMessageDialog(null, "Nathaniel P. Rijndorp\nHi Mr. Lee, you have " + gross + " gross " + dozen + " dozen and " + extra + " extra flash drives.");
    }
}
