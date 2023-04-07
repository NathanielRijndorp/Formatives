package Lab_6;

import javax.swing.*;

public class Activity_3 {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        String numbers = "";
        int capacity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter array capacity: ", author, JOptionPane.INFORMATION_MESSAGE));
        int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        int[] arr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: ", author, JOptionPane.INFORMATION_MESSAGE));
            numbers += "Input integer: " + arr[i] + "\n";
            if (arr[i] > highest) {
                highest = arr[i];
            }
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        JOptionPane.showMessageDialog(null, numbers + "\nHighest: " + highest + "\nLowest: " + lowest, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
