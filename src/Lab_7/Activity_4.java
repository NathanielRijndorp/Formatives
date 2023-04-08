package Lab_7;

import javax.swing.*;

public class Activity_4 {
    public static int sumDouble(int a, int b) {
        int c = 0;
        if (a == b) {
            c = (a + b) * 2;
        } else {
            c = a + b;
        }
        return c;
    }
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: ", author, JOptionPane.INFORMATION_MESSAGE));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: ", author, JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "Output: " + sumDouble(a,b) , author, JOptionPane.INFORMATION_MESSAGE);
    }
}
