package Lab_5_1;

import javax.swing.*;

public class Palindromes {
    public static void main(String[] args) {
        //variables
        String author = "Created by Nathaniel P. Rijndorp";
        String input = String.valueOf(JOptionPane.showInputDialog(null, new JTextArea("Enter a String."), author, 1));
        StringBuilder str_reverse = new StringBuilder();
        str_reverse.append(input);
        str_reverse.reverse();
        String reversed_str = String.valueOf(str_reverse);
        //util
        if (reversed_str.equalsIgnoreCase(input)) {
            JOptionPane.showMessageDialog(null, new JTextArea(input + " is a Palindrome." ), author,1);
        } else {
            JOptionPane.showMessageDialog(null, new JTextArea(input + " is not a Palindrome." ), author,1);
        }
    }
}
