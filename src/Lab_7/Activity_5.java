package Lab_7;

import javax.swing.*;
import java.util.Arrays;

public class Activity_5 {
    public static int a_len (int [] a) {
        int length = 0;
        for (int ints : a) {
            length++;
        }
        return length;
    }
    public static int b_len (int [] b) {
        int length = 0;
        for (int ints : b) {
            length++;
        }
        return length;
    }
    public static int ab_len (int [] a, int[] b) {
        int length = 0;
        for (int ints : a) {
            length++;
        }
        for (int ints : b) {
            length++;
        }
        return length;
    }
    public static int[] union (int[] a, int[] b) {
        int dupes = 0, len = ab_len(a,b);
        int b_counter = 0;
        for (int i = 0; i < a_len(a); i++) {
            for (int x = 0; x < b_len(b); x++) {
                if (a[i] == b[x]) {
                    dupes++;
                }
            }
        }
        int[] unionSet = new int[len-dupes];
        for (int i = 0; i < (len-dupes)+dupes; i++) {
            if (i < a_len(a)) {
                unionSet[i] = a[i];
            } else {
                unionSet[i-dupes] = b[b_counter];
                b_counter++;
            }
        }
        return unionSet;
    }
    public static int[] unionAll (int[] a, int[] b) {
        int len = ab_len(a,b);
        int[] arr_rep = new int[len];
        int b_counter =0;
        int[] unionSetAll = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < a_len(a)) {
                unionSetAll[i] = a[i];
                for (int x = 0; x < b_len(b); x++) {
                    if (a[i] == b[x]) {
                        arr_rep[i] = a[i];
                    }
                }
            } else if (i < len) {
                unionSetAll[i] = b[b_counter];
                b_counter++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (!(arr_rep[i] == 0)) {
                unionSetAll[i+1] = arr_rep[i];
            }
        }
        return unionSetAll;
    }
    public static int[] intersection (int[] a, int[] b) {
        int dupes = 0;
        int counter = 0;
        for (int i = 0; i < a_len(a); i++) {
            for (int x = 0; x < b_len(b); x++) {
                if (a[i] == b[x]) {
                    dupes++;
                }
            }
        }
        int[] items = new int[dupes];
        for (int i = 0; i < a_len(a); i++) {
            for (int x = 0; x < b_len(b); x++) {
                if (a[i] == b[x]) {
                    items[counter] = a[i];
                    counter++;
                }
            }
        }
        return items;
    }
    public static String difference (int[] a, int[] b, int set_select) {
        String item = "";
        if (set_select == 0) {
            for (int i = 0; i < a_len(a); i++) {
                int counter = 0;
                for (int x = 0; x < b_len(b); x++) {
                    if (a[i] != b[x]) {
                        counter++;
                        if (counter >= b_len(b)) {
                            item += " " + (a[i]);
                        }
                    }
                }
            }
        } else if (set_select == 1) {
            for (int i = 0; i < a_len(a); i++) {
                int counter = 0;
                for (int x = 0; x < b_len(b); x++) {
                    if (b[i] != a[x]) {
                        counter++;
                        if (counter >= b_len(b)) {
                            item += " " + (b[i]);
                        }
                    }
                }
            }
        } else {
            item = "Invalid Input";
            JOptionPane.showMessageDialog(null, "Invalid input:" );
        }
        return item;
    }
    public static String complement (int[] a, int[] b, int comp_select) {
        String item = "";
        if (comp_select == 0) {
            for (int i = 0; i < b_len(b); i++) {
                int counter = 0;
                for (int x = 0; x < a_len(a); x++) {
                    if (b[i] != a[x]) {
                        counter++;
                        if (counter >= a_len(a)) {
                            item += " " + (b[i]);
                        }
                    }
                }
            }
        } else if (comp_select == 1) {
            for (int i = 0; i < a_len(a); i++) {
                int counter = 0;
                for (int x = 0; x < b_len(b); x++) {
                    if (a[i] != b[x]) {
                        counter++;
                        if (counter >= b_len(b)) {
                            item += " " + (a[i]);
                        }
                    }
                }
            }
        } else {
            item = "Invalid Input";
            JOptionPane.showMessageDialog(null, "Invalid input:" );
        }
        return item;
    }
    public static String symmetricDiff (int[] a, int[] b) {
        String item = "";
        for (int i = 0; i < a_len(a); i++) {
            int counter = 0;
            for (int x = 0; x < b_len(b); x++) {
                if (a[i] != b[x]) {
                    counter++;
                    if (counter >= b_len(b)) {
                        item += " " + (a[i]);
                    }
                }
            }
        }
        for (int i = 0; i < a_len(a); i++) {
            int counter = 0;
            for (int x = 0; x < b_len(b); x++) {
                if (b[i] != a[x]) {
                    counter++;
                    if (counter >= b_len(b)) {
                        item += " " + (b[i]) ;
                    }
                }
            }
        }
        return item;
    }
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        int set_select = Integer.parseInt(JOptionPane.showInputDialog(null, "[0] For difference A/B: " +
                "\n[1] For difference B/A: "));
        int comp_select = Integer.parseInt(JOptionPane.showInputDialog(null, "[0] For complement A': " +
                "\n[1] For complement B': "));

        int[] a = {1,2,3};
        int[] b = {2,3,4};

        JOptionPane.showMessageDialog(null, "Union: " + (Arrays.toString(union(a,b))) +
                "\nUnionAll: " + (Arrays.toString(unionAll(a,b))) +
                "\nIntersection: " + (Arrays.toString(intersection(a,b))) +
                "\nDifference: " + (difference(a,b,set_select)) +
                "\nComplement: " + (complement(a,b,comp_select)) +
                "\nSymmetric Difference: " + (symmetricDiff(a,b)) ,author, JOptionPane.INFORMATION_MESSAGE);
    }
}