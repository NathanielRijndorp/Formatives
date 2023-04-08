package Lab_7;

import javax.swing.*;

public class Activity_1 {
    public static boolean isNegative(int num) {
        return num < 0;
    }
    public static boolean isPositive(int num) {
        return num > 0;
    }
    public static String Odd(int num) {
        return num%2 == 1 || num%2 == -1 ? "Yes" : "No";
    }
    public static String Even(int num) {
        return num%2 == 0 ? "Yes" : "No";
    }
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number: ", author, JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "The number is: " + num +
                "\nisNegative: " + isNegative(num) +
                "\nisPositive: " + isPositive(num) +
                "\nOdd: " + Odd(num) +
                "\nEven: " + Even(num));
    }

}
