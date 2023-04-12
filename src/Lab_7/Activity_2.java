package Lab_7;

import javax.swing.*;

public class Activity_2 {
    public static String binary(int val) {
        String binaryNumber = "";
        int number = 0;
        while (!(val == 1)) {
            val = val/2;
            number = val%2==0 ? 0 : 1;
            binaryNumber += number;
        }
        binaryNumber += val%2 == 0 ? 1 : 0;
        return binaryNumber;
    }
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        int val = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number to convert: ", author, JOptionPane.INFORMATION_MESSAGE));
        String bin = binary(val);
        JOptionPane.showMessageDialog(null, "Converted value is: " + bin);
    }
}
