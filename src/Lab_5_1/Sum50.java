package Lab_5_1;

import javax.swing.*;

public class Sum50 {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        int tracker = 0, num = 0;
        // util
        while (tracker < 50) {
            tracker++;
            num+=tracker;
        }
        JOptionPane.showMessageDialog(null, "The sum of the numbers from 1 to 50 is: " + num, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
