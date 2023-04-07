package Lab_6;

import javax.swing.*;

public class Activity_2 {
    public static void main(String[] args) {

        String author = "Created by: Nathaniel P. Rijndorp";
        String a = "", b = "", c = "", d = "";
        int[] arr = {12,-45,18,-100,50,30,3,-8,9, 1};
        for (int i = 0; i < arr.length; i++) {
            a += arr[i]%2 == 1 || arr[i]%2 == -1 ? arr[i] + " " : "";
            b += arr[i]%2 == 0 ? arr[i] + " " : "";
            c += arr[i] < 0 ? arr[i] + " " : "";
            d += arr[i] > 0 ? arr[i] + " " : "";
        }
        JOptionPane.showMessageDialog(null, "All odd numbers: " + a +
                "\nAll even numbers: " + b +
                "\nAll negative integers: " + c +
                "\nAll positive integers: " + d,
                author, JOptionPane.INFORMATION_MESSAGE);
    }
}
