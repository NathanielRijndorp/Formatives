package Lab_5_1;

import javax.swing.*;

public class SumOfNOdd {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        int counter = 1;
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int total = 0;
        String num = " ";
        String plus = " + ";
        String values = "";
        // util
        for (int add = 1; input+1 > counter; counter++) {
            if (counter == input) {
                plus = "";
            }
            num = add + plus;
            total+=add;
            add+=2;
            values += num;
        }
        JOptionPane.showMessageDialog(null, "Value of N: " + input + "\n" + values + " = " + total, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
