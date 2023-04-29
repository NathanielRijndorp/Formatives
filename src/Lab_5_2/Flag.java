package Lab_5_2;

import javax.swing.*;

public class Flag {
    public static void main(String[] args) {
        // variables
        String author = "Created by Nathaniel P. Rijndorp";
        String vowel = "";
        boolean statement = false;
        // util
        while (!statement) {
            vowel = String.valueOf(JOptionPane.showInputDialog(null, new JTextArea("Type a character:"), author, 1));
            if (vowel.matches("[aeiouAEIOU]")) {
                statement = true;
                JOptionPane.showMessageDialog(null, new JTextArea("Found a vowel. Program terminating..."));
            } else {
                JOptionPane.showMessageDialog(null, new JTextArea("Not that as I am expecting. Try again."));
            }
        }
    }
}
