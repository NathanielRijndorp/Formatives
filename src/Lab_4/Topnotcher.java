package Lab_4;

import javax.swing.*;

public class Topnotcher {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        short input_1, input_2, input_3, input_4, input_5, input_6, input_7, input_8, input_9, input_10;
        short largest = 0;
        input_1 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_2 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_3 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_4 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_5 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_6 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_7 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_8 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_9 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));
        input_10 = Short.parseShort(JOptionPane.showInputDialog(null, "Input num: "));

        if (input_1 > input_2 && input_1 > input_3 && input_1 > input_4 && input_1 > input_5 && input_1 > input_6 && input_1 > input_7 && input_1 > input_8 && input_1 > input_9 && input_1 > input_10 ) {
            largest = input_1;
        }
        else if (input_2 > input_1 && input_2 > input_3 && input_2 > input_4 && input_2 > input_5 && input_2 > input_6 && input_2 > input_7 && input_2 > input_8 && input_2 > input_9 && input_2 > input_10 ) {
            largest = input_2;
        }
        else if (input_3 > input_1 && input_3 > input_2 && input_3 > input_4 && input_3 > input_5 && input_3 > input_6 && input_3 > input_7 && input_3 > input_8 && input_3 > input_9 && input_3 > input_10 ) {
            largest = input_3;
        }
        else if (input_4 > input_1 && input_4 > input_3 && input_4 > input_2 && input_4 > input_5 && input_4 > input_6 && input_4 > input_7 && input_4 > input_8 && input_4 > input_9 && input_4 > input_10 ) {
            largest = input_4;
        }
        else if (input_5 > input_1 && input_5 > input_3 && input_5 > input_4 && input_5 > input_2 && input_5 > input_6 && input_5 > input_7 && input_5 > input_8 && input_5 > input_9 && input_5 > input_10 ) {
            largest = input_5;
        }
        else if (input_6 > input_1 && input_6 > input_3 && input_6 > input_4 && input_6 > input_5 && input_6 > input_2 && input_6 > input_7 && input_6 > input_8 && input_6 > input_9 && input_6 > input_10 ) {
            largest = input_6;
        }
        else if (input_7 > input_1 && input_7 > input_3 && input_7 > input_4 && input_7 > input_5 && input_7 > input_6 && input_7 > input_2 && input_7 > input_8 && input_7 > input_9 && input_7 > input_10 ) {
            largest = input_7;
        }
        else if (input_8 > input_1 && input_8 > input_3 && input_8 > input_4 && input_8 > input_5 && input_8 > input_6 && input_8 > input_7 && input_8 > input_2 && input_8 > input_9 && input_8 > input_10 ) {
            largest = input_8;
        }
        else if (input_9 > input_1 && input_9 > input_3 && input_9 > input_4 && input_9 > input_5 && input_9 > input_6 && input_9 > input_7 && input_9 > input_8 && input_9 > input_2 && input_9 > input_10 ) {
             largest = input_9;
        }
        else if (input_10 > input_1 && input_10 > input_3 && input_10 > input_4 && input_10 > input_5 && input_10 > input_6 && input_10 > input_7 && input_10 > input_8 && input_10 > input_9 && input_10 > input_2 ) {
            largest = input_10;
        }
        JOptionPane.showMessageDialog(null, new JTextArea("Nathaniel P. Rijndorp"+ "\nThe highest score the Java Certification Exam is: " + largest));


    }
}

