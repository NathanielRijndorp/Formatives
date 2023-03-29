package Lab_2;

import javax.swing.*;

public class Lab2_Problem3 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String end = "";
        String strand = "";
        float totalLength = 0,km, miles, hairLength = 0;
        int n = 0;
        while(true) {
            n++;
            strand = JOptionPane.showInputDialog("Enter strand length: ");
            if(strand.length() == 0){
                break;
            }
            hairLength = Float.parseFloat(strand);
            totalLength += hairLength;
            end += "Strand hair sample " + n + " is " + (strand) + " cm\n";
        } // Output
        km = totalLength / 100000;
        miles = km * 0.62f;
        JOptionPane.showMessageDialog(null, end);
        JOptionPane.showMessageDialog(null, "Nathaniel P. Rijndorp" + "\nThere are " + (n-1) + " strand(s): " + "\nTotal hair length in cm: " + totalLength + "\nTotal hair length in km: " + km + "\nTotal hair length in mi: " + miles);
    }
}
