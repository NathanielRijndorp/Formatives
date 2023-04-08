package Lab_7;

import javax.swing.*;

public class Activity_2 {
    public static String binary(int val) {
        String binaryNumber = "", reverse_binaryNumber = "";
        int counter = 0;
        reverse_binaryNumber += val%2 == 0 ? 0 : 1;
        while (!(val == 1)) {
            val = val/2;
            reverse_binaryNumber+= val%2;
            counter++;
        }
        System.out.println(reverse_binaryNumber);
        for (int i = counter; i > -1; i--) {
            binaryNumber += reverse_binaryNumber.charAt(i);
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        int val = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number to convert: ", author, JOptionPane.INFORMATION_MESSAGE));
        String bin = binary(val);
        JOptionPane.showMessageDialog(null, "Converted value is: " + bin);


    }
}
