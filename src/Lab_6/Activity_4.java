package Lab_6;

import javax.swing.*;

public class Activity_4 {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        String arr_val  = "\n", spacing = ", ";
        int capacity = 0, dupes = 0;
        while (!(capacity >= 5)) {
            capacity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter capacity! Must be above or equivalent to 20.", author , JOptionPane.INFORMATION_MESSAGE));
            if (!(capacity >= 5)) {
                JOptionPane.showMessageDialog(null, "Must be above or equivalent to 20!", author, JOptionPane.WARNING_MESSAGE);
            }
        }
        int[] arr = new int[capacity]; int[] dupli_counter = new int[capacity];int [] duplicate = new int[capacity];
        boolean[] dupe = new boolean[capacity];
        // put numbers
        for (int i = 0; i < capacity; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number: ", author , JOptionPane.INFORMATION_MESSAGE));
            if (i == capacity-1) {
                spacing = "";
            }
            arr_val += arr[i] + spacing;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!dupe[i]) {
                dupes = 0;
                for (int x = i + 1; x < arr.length; x++) {
                    if (arr[i] == arr[x]) {
                        dupli_counter[i]++;
                        duplicate[i] = (arr[i]);
                        dupes++;
                        dupe [x] = true;
                    }
                }
                if (dupes > 0) {
                    arr_val +=  "\n" + (arr[i]) + " -> " + (dupes + 1) + " times";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "The array values are: " + arr_val, author ,JOptionPane.INFORMATION_MESSAGE);
    }
}
