package Lab_3;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab3_3_variant_2 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String name = "Nathaniel P. Rijndorp";
        String[] month = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String gross_inc = "Please Enter your Gross Income for the month of ";
        String tot_expense = "Please Enter your Total Expenses for the month of ";
        String success = "You have successfully saved your information!";
        String output = "";
        float gross, total_exp, net_income, grossT = 0, total_expT = 0, net_incomeT = 0;

        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                output += String.format("%-20s\t%-20s%-20s%-20s\n", "Month", "Gross Income", "Total Expenses", "Net Income");
            }
            gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+month[i], name, 1));
            grossT += gross;
            total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+month[i], name, 1));
            total_expT += total_exp;
            net_income = gross - total_exp;
            net_incomeT += net_income;
            output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", month[i], gross, total_exp, net_income);

        }
        try {
            File file = new File("Sales.txt");
            FileWriter fWriter = new FileWriter(file, false);
            fWriter.write(output);
            fWriter.close();
            JOptionPane.showMessageDialog(null, success, name, JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}