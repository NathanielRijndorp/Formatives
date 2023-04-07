package Lab_6;

import javax.swing.*;

public class Activity_6 {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        String orig_str = "", copy_str = "";
        int orig[]=new int[15];
        int copy[]=new int[15];
        for (int i = 0; i < orig.length; i++) {
            orig[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer: ",author ,JOptionPane.INFORMATION_MESSAGE));
            orig_str += " " + orig[i];
        }
        for (int i = 0; i < copy.length; i++) {
            copy[i] = orig[i];
            copy_str += " " + copy[i];
        }
        JOptionPane.showMessageDialog(null, "Original array:" + orig_str + "\nCopy array:" + copy_str, author, JOptionPane.INFORMATION_MESSAGE);
    }
}

