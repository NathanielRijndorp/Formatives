package Lab_2;

import javax.swing.*;

public class Lab2_Problem2 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        int n = 0;
        float input, add = 0f, avg = 0f;
        while(n < 10) {

            input = Float.parseFloat(JOptionPane.showInputDialog("Input a number: "));
            add +=input;
            n++;
        }

        avg = add/n;
        JOptionPane.showMessageDialog(null, "Nathaniel P. Rijndorp" + "\nYour average is: " + avg);
    }
}
