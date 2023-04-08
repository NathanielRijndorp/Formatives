package Lab_6;

import javax.swing.*;

public class Activity_5 {
    public static void main(String[] args) {
        // variables
        int[] arr = new int[10];
        String author = "Created by: Nathaniel P. Rijndorp", arr_val = "", reverse_arr = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number: "));
            arr_val+= " " + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            reverse_arr+= " " + (arr[9-i]);
            System.out.println(arr[9-i]);
        }
        JOptionPane.showMessageDialog(null, "If array elements are," + arr_val + "\nThe reverse is:"+ reverse_arr, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
