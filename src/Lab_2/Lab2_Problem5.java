package Lab_2;

import javax.swing.*;

public class Lab2_Problem5 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        final float SSS = 175.89f, PhilHealth = 300;
        //Input
        float ratePerHour = Float.parseFloat(JOptionPane.showInputDialog("Enter rate per hour: "));
        float hoursWorked = Float.parseFloat(JOptionPane.showInputDialog("Enter hours worked: "));
        float absences = Float.parseFloat(JOptionPane.showInputDialog("Enter absences: "));
        float late = Float.parseFloat(JOptionPane.showInputDialog("Enter late hours: "));

        float gross = (ratePerHour*hoursWorked);
        float totalDeduction = (absences+late+ SSS+PhilHealth);
        float net = (ratePerHour*hoursWorked) - totalDeduction;

        JOptionPane.showMessageDialog(null, new JTextArea("Nathaniel P. Rijndorp\n"+ "Gross \t: " + gross + "\nTotal deduction \t: " + totalDeduction + "\nNet \t: " + net));
    }

}
