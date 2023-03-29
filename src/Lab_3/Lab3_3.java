package Lab_3;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab3_3 {
    public static void main(String[] args){ //Nathaniel P. Rijndorp
        // Initialization
        String name = "Nathaniel P. Rijndorp";
        String gross_inc = "Please Enter your Gross Income for the month of ";
        String tot_expense = "Please Enter your Total Expenses for the month of ";
        String success = "You have successfully saved your information!";
        String output = "******Rijndorp & Co., Ltd - Risk Management & Asset Counseling for Standard & Poor's 500******\n" +
                        "Year             :            2023\n" +
                        "**********************************************************************************************\n";

        String jan = "January", feb = "February", mar = "March", apr = "April", may = "May", jun = "June", jul = "July", aug = "August", sep = "September", oct = "October", nov = "November", dec = "December";

        float gross, total_exp, net_income, grossT = 0, total_expT = 0, net_incomeT = 0;
        // Input
        output += String.format("%-20s\t%-20s%-20s%-20s\n", "Month", "Gross Income", "Total Expenses", "Net Income");
        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+jan, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+jan, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", jan, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+feb, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+feb, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", feb, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+mar, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+mar, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", mar, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+apr, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+apr, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", apr, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+may, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+may, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", may, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+jun, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+jun, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", jun, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+jul, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+jul, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", jul, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+aug, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+aug, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", aug, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+sep, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+sep, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", sep, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+oct, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+oct, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", oct, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+nov, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+nov, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", nov, gross, total_exp, net_income);

        gross = Float.parseFloat(JOptionPane.showInputDialog(null, gross_inc+dec, name, JOptionPane.QUESTION_MESSAGE));
        grossT += gross;
        total_exp = Float.parseFloat(JOptionPane.showInputDialog(null, tot_expense+dec, name, JOptionPane.QUESTION_MESSAGE));
        total_expT += total_exp;
        net_income = gross - total_exp;
        net_incomeT += net_income;
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", dec, gross, total_exp, net_income);
        output += String.format("%-20s\t%-18.2f\t%-18.2f\t%-18.2f\n", "Total", grossT, total_expT, net_incomeT);
        // Output
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