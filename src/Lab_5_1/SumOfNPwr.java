package Lab_5_1;

import javax.swing.*;

public class SumOfNPwr {
    public static void main(String[] args) {
        // variables
        int counter = 1;
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int total = 0;
        String num = " ";
        String plus = " + ";
        // util
        System.out.println("Created by: Nathaniel P. Rijndorp");
        for (int add = 1; input+1 > counter; counter++) {
            if (counter == input) {
                plus = "";
            }
            num = (add*add) + plus;
            total+=(add*add);
            add++;
            if (counter == 1) {
                System.out.println("Value of N: " + input);
            }
            System.out.print(num);
        }
        System.out.println(" = " + total);
    }
}
