package Lab_6;

import javax.swing.*;

public class Activity_1 {
    public static void main(String[] args) {
        int num[]=new int[10];
        int first=0, last=0, atIndex=0;
        String all="";
        String author = "Created by: Nathaniel P. Rijndorp";
//a. Loop to store 10 numbers to array
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: ", author, JOptionPane.INFORMATION_MESSAGE));
            //Your codes here...
        }
//b. Loop to display values from Array - use 'all.'
        for (int i = 0; i < num.length; i++) {
            all += num[i] + " ";
            //Your codes here...
        }
        JOptionPane.showMessageDialog(null,"Array Elements are\t: "+all);
//Codes here to determine the first value
        first = num[0];
        JOptionPane.showMessageDialog(null,"The first value is \t: "+first);
//Codes here to determine the last value
        last = num[9];
        JOptionPane.showMessageDialog(null,"The last value is\t: "+last);
//Codes here to determine the search value through the index
        atIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter index to query: ", author, JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null,"The value at index "+atIndex+ " is\t: "+num[atIndex]);
//Codes here to change a value of array elements through the index
        atIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter index to change"));
        num[atIndex] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new number: ", author, JOptionPane.INFORMATION_MESSAGE));
        all="";
        for (int i = 0; i < num.length; i++) {
            all += num[i] + " ";
            //Your codes here...
        }
        JOptionPane.showMessageDialog(null,"Array Elements are\t: "+all);
    }
}
