package Lab_3;

import javax.swing.*;
import java.io.*;


public class Lab3_2 {

    public static void main (String[] args) { //Nathaniel P. Rijndorp
        String name, program, course, ask = " ", remarks, output;
        float exam1 = 0, exam2 = 0, exam3 = 0,exam4 = 0,average;

        File file = new File("students.txt");

        name = JOptionPane.showInputDialog("Input the student's Name: ");
        program = JOptionPane.showInputDialog("Input the program: ");
        course = JOptionPane.showInputDialog("Input the course: ");

        try {
            ask="Please input grade for the following examinations:\nFirst: ";
            exam1 = Float.parseFloat(JOptionPane.showInputDialog(null, ask));
            ask = "Please input grade for the following examinations:\nSecond: ";
            exam2 = Float.parseFloat(JOptionPane.showInputDialog(null, ask));
            ask = "Please input grade for the following examinations:\nThird: ";
            exam3 = Float.parseFloat(JOptionPane.showInputDialog(null, ask));
            ask = "Please input grade for the following examinations:\nFourth: ";
            exam4 = Float.parseFloat(JOptionPane.showInputDialog(null, ask));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        average = (exam1 + exam2 + exam3 + exam4)/4;
        average = Math.round(average*100.0f)/100.0f;
        if (average >= 75) {

            remarks = "Passed";

        } else {

            remarks = "Failed";

        }
        JOptionPane.showMessageDialog(null, "Student's name: " + name + "\nProgram name:" + program + "\nCourse: " + course + "\n\n 1st        2nd        3rd        4th\n"
                + exam1 + "     " + exam2 + "     " + exam3 + "     " + exam4 + "\n\nAverage:" + average + "\nRemarks:" + remarks);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog (null, "Would you like to save your information?");

        if (dialogButton == JOptionPane.YES_OPTION) {
            try {
                output = "\n\tName \t\t\t\t Program \t\t Course \t\t First \t Second \t Third \t Fourth \t Average \t Remarks" + "\n" + name + "\t" + program + "\t" + course + "\t\t\t " + exam1 + "\t  " + exam2 + "\t     " + exam3 + "\t  " + exam4 + "\t      " + average + "\t\t  " + remarks;
                FileWriter fWrite = new FileWriter(file);
                fWrite.write("------------------------Student Information------------------------");
                fWrite.write(output);
                fWrite.close();
            }
            catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}