package Lab_7;

import javax.swing.*;

public class Activity_3 {

    public static String reverse(String str) {
        String value = "";
        for (int i = 0; i < str.length(); i++) {
            value += str.charAt(str.length()-1-i);
        }
        return value;
    }
    public static boolean isPalindrome(String strReverse) {
        return strReverse.equalsIgnoreCase(reverse(strReverse));
    }
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        String str = String.valueOf(JOptionPane.showInputDialog(null, "Enter string:", author, JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "The reverse of: " + str + " is " + reverse(str) + "\nisPalindrome: " + isPalindrome(reverse(str)), author, JOptionPane.INFORMATION_MESSAGE);
    }
}
