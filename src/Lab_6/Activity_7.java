package Lab_6;

import javax.swing.*;

public class Activity_7 {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp", arr_elem = "", found_at = "";
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: ", author, JOptionPane.INFORMATION_MESSAGE));
            arr_elem += " " + arr[i];
        }
        int find_val = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value to find:", author, JOptionPane.INFORMATION_MESSAGE));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find_val) {
                found_at += " " + i   ;
            }
        }
        if (found_at.equals("")) {
            JOptionPane.showMessageDialog(null, "If array elements are" + arr_elem + "\nSearch a value: " + find_val + "\n" + find_val + " is NOT Found", author, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "If array elements are" + arr_elem + "\nSearch a value: " + find_val + "\n" + find_val + " is found at index/indices:" + found_at, author, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
