package Lab_7;

import javax.swing.*;
import java.util.Arrays;

public class Activity_5 {
    public static int[] union (int[] a, int[] b) {
        int dupes = 0, len = a.length + b.length;
        int b_counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int x = 0; x < b.length; x++) {
                if (a[i] == b[x]) {
                    dupes++;
                }
            }
        }
        int[] unionSet = new int[len-dupes];
        for (int i = 0; i < unionSet.length; i++) {
            if (i < a.length) {
                unionSet[i] = a[i];
            } else {
                unionSet[i] = b[a.length+b_counter-1];
                b_counter++;
            }
        }
        return unionSet;
    }
    public static int[] unionAll (int[] a, int[] b) {
        int len = a.length + b.length;
        int dupes = 0;
        int[] unionSetAll = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < a.length ) {
                unionSetAll[i+dupes] = a[i];
                if (i >= 1) {
                    if (a[i] == b[i-1]) {
                        dupes++;
                        unionSetAll[i+dupes] = a[i];
                    }
                }
            } else if (i + dupes + 1 <= a.length + b.length) {
                unionSetAll[i + dupes] = b[b.length - i + dupes];
            }
        }
        return unionSetAll;
    }
    public static int[] intersection (int[] a, int[] b) {
        int dupes = 0;
        for (int i = 0; i < b.length; i++) {
            for (int x = 0; x < b.length; x++) {
                if (a[i] == b[x]) {
                   dupes++;
                }
            }
        }
        int[] items = new int[dupes];
        for (int i = 0; i < b.length; i++) {
            for (int x = 0; x < b.length; x++) {
                if (a[i] == b[x]) {
                    items[i-1] = a[i];
                }
            }
        }
        return items;
    }
    public static String difference (int[] a, int[] b, int set_select) {
        String item = "";
        if (set_select == 0) {
            for (int i = 0; i < b.length; i++) {
                int counter = 0;
                for (int x = 0; x < b.length; x++) {
                    if (a[i] != b[x]) {
                        counter++;
                        if (counter >= b.length) {
                            item += " " + (a[i]);
                        }
                    }
                }
            }
        } else if (set_select == 1) {
            for (int i = 0; i < b.length; i++) {
                int counter = 0;
                for (int x = 0; x < b.length; x++) {
                    if (b[i] != a[x]) {
                        counter++;
                        if (counter >= b.length) {
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
        // 1,2,3
        // 2,3,4
    }
    public static String complement (int[] a, int[] b, int comp_select) {
        String item = "";
        if (comp_select == 0) {
            for (int i = 0; i < b.length; i++) {
                int counter = 0;
                for (int x = 0; x < b.length; x++) {
                    if (b[i] != a[x]) {
                        counter++;
                        if (counter >= b.length) {
                            item += " " + (b[i]);
                        }
                    }
                }
            }
        } else if (comp_select == 1) {
            for (int i = 0; i < b.length; i++) {
                int counter = 0;
                for (int x = 0; x < b.length; x++) {
                    if (a[i] != b[x]) {
                        counter++;
                        if (counter >= b.length) {
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
            for (int i = 0; i < b.length; i++) {
                int counter = 0;
                for (int x = 0; x < b.length; x++) {
                    if (a[i] != b[x]) {
                        counter++;
                        if (counter >= b.length) {
                            item += " " + (a[i]);
                        }
                    }
                }
            }
        for (int i = 0; i < b.length; i++) {
            int counter = 0;
            for (int x = 0; x < b.length; x++) {
                if (b[i] != a[x]) {
                    counter++;
                    if (counter >= b.length) {
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
        int comp_select = Integer.parseInt(JOptionPane.showInputDialog(null, "[0] For complement A: " +
                    "\n[1] For complement B: "));

        int[] a = {1,2,3};
        int[] b = {2,3,4};

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value for Set A :", author, JOptionPane.INFORMATION_MESSAGE));
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value for Set B :", author, JOptionPane.INFORMATION_MESSAGE));
        }
        JOptionPane.showMessageDialog(null, "Union: " + (Arrays.toString(union(a,b))) +
                "\nUnionAll: " + (Arrays.toString(unionAll(a,b))) +
                "\nIntersection: " + (Arrays.toString(intersection(a,b))) +
                "\nDifference: " + (difference(a,b,set_select)) +
                "\nComplement: " + (complement(a,b,comp_select)) +
                "\nSymmetric Difference: " + (symmetricDiff(a,b)) ,author, JOptionPane.INFORMATION_MESSAGE);
    }
}
