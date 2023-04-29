package Lab_5_1;

import javax.swing.*;

public class EvenNum {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        String str_for = "", str_while = "",str_do_while = "";
        int while_num = 0, do_while_num = 0;
        // util
        for (int for_num = 0; for_num <= 50; for_num+=2) {
            if (for_num > 0) {
                str_for += for_num + " ";
            }
        }
        while (while_num < 50) {
            while_num+= 2;
            str_while += while_num + " ";
        }
        do {
            do_while_num+= 2;
            str_do_while += do_while_num + " ";
        } while (do_while_num < 50);
        JOptionPane.showMessageDialog(null, "---Using For Loop---\n" + str_for +
                "\n---Using While Loop---\n" + str_while +
                "\n---Using Do-While Loop---\n" + str_do_while, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
