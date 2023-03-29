package Lab_4;

import javax.swing.*;

public class PointGradeValidation {

    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String output = "Nathaniel P. Rijndorp";
        String stud_id, name, dept, course, subj, remarks;
        String inp_studId = String.format("Input Student ID: ");
        String inp_name = String.format("Input Name: ");
        String inp_dept = String.format("Input Department: ");
        String inp_course = String.format("Input Course: ");
        String inp_subj = String.format("Input Subject: ");
        String num_exam1 = "First ";
        String num_exam2 = "Second";
        String num_exam3 = "Third";
        String num_exam4 = "Final";
        stud_id = JOptionPane.showInputDialog(null, new JTextArea(inp_studId));
        name = JOptionPane.showInputDialog(null, new JTextArea(inp_name));
        dept = JOptionPane.showInputDialog(null, new JTextArea(inp_dept));
        course = JOptionPane.showInputDialog(null, new JTextArea(inp_course));
        subj = JOptionPane.showInputDialog(null, new JTextArea(inp_subj));

        byte grade_1, grade_2, grade_3, grade_4;
        float average = 0;
        float point = 0;

        grade_1 = Byte.parseByte(JOptionPane.showInputDialog(null, new JTextArea(num_exam1 + " Exam: ")));
        average += grade_1;
        grade_2 = Byte.parseByte(JOptionPane.showInputDialog(null, new JTextArea(num_exam2 + " Exam: ")));
        average += grade_2;
        grade_3 = Byte.parseByte(JOptionPane.showInputDialog(null, new JTextArea(num_exam3 + " Exam: ")));
        average += grade_3;
        grade_4 = Byte.parseByte(JOptionPane.showInputDialog(null, new JTextArea(num_exam4 + " Exam: ")));
        average += grade_4;

        average = average/4;
        point = (100-average+10)/10;
        if (average < 0) {
            remarks = "No such grade";
            point = 0.00f;
        } else if (average < 50) {
            remarks = "Dropped";
            point = 9.00f;
        } else if (average < 75) {
            remarks = "Failed";
            point = 5.00f;
        } else if (average < 80) {
            remarks = "Passed - Satisfactory";
        } else if (average < 85) {
            remarks = "Passed - Good";
        } else if (average < 90) {
            remarks = "Passed - Average";
        } else if (average < 100) {
            remarks = "Passed - Very Good";
        } else if (average == 100) {
            remarks = "Passed - Excellent";
        } else {
            remarks = "Out of range or Invalid";
        }
        String stud_details = "*****Student Details*****" + "\nStudent ID: " + stud_id + "\nName: " + name + "\nDepartment: " + dept + "\nCourse: " + course + "\nSubject: " + subj;
        String grade_details = "*****Grade Details*****\n" + num_exam1 + ": " + grade_1 + "\n" + num_exam2 + ": " + grade_2 + "\n" + num_exam3 + ": " + grade_3 + "\n" + num_exam4 + ": " + grade_4;

        JOptionPane.showMessageDialog(null, new JTextArea(stud_details), output, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(grade_details + "\nAverage: " + average + "\nPoint Grade: " + point + "\nRemarks: " + remarks), output, 1);
    }
}
