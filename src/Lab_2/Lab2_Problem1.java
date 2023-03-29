package Lab_2;

import javax.swing.*;

public class Lab2_Problem1 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        float num_1 = Float.parseFloat(JOptionPane.showInputDialog("Enter value of Num1: "));
        float num_2 = Float.parseFloat(JOptionPane.showInputDialog("Enter value of Num2: "));

        float sum = (num_1+num_2), diff = (num_1 - num_2), prod = (num_1*num_2), quo = (num_1/num_2);

        JOptionPane.showMessageDialog(null, "Nathaniel P. Rijndorp" + "\nSum: "+ (sum) + "\nDifference: "+ (diff) +"\nProduct: " + (prod) +"\nQuotient: " + (quo));
        
    }
}
