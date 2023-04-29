package Lab_5_1;

import javax.swing.*;

public class TableOfSquares {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        int while_num = 0, do_while_num = 0;
        String str_for = "", str_while = "", str_do_while = "";
        //util
        for (int for_num = 1; for_num <= 20; for_num++) {
            str_for+=("\nNumber:" + for_num + " Square: " + (for_num*for_num));
        }
        while (while_num < 20) {
            while_num++;
            str_while+=("\nNumber: " + while_num + " Square: " + (while_num*while_num));
        }
        do {
            do_while_num++;
            str_do_while+=("\nNumber: " + do_while_num + " Square: " + (do_while_num*do_while_num));
        } while (do_while_num < 20);
        JOptionPane.showMessageDialog(null, "---Using For Loop---" + str_for, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "---Using While Loop---" + str_while, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "---Using Do-While Loop---" + str_do_while, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
