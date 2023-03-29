package Lab_5_2;

import javax.swing.*;

public class Summation {
    public static void main(String[] args) {
        //variables
        String author = "Created by Nathaniel P. Rijndorp";
        int input_1 = Integer.parseInt(JOptionPane.showInputDialog(null, new JTextArea("Input first number: "), author, 1));
        int input_2 = Integer.parseInt(JOptionPane.showInputDialog(null, new JTextArea("Input second number: "), author, 1));
        int[] input_3 = new int[input_2];
        int i = 0;
        int sum = 0;
        float avg;
        if (input_1 > input_2) {
            JOptionPane.showMessageDialog(null, new JTextArea("Sorry! second integer must be greater than " + input_1), author, 1);
        } else {
            while (input_1 <= input_2) {
                input_3[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer: "));
                sum+=input_3[i];
                i++;
                input_1++;
            }
            avg = (float) sum/i;
            JOptionPane.showMessageDialog(null, new JTextArea("Total sum\t: " + sum + "\nAverage\t: " + avg));
        }
    }
}
