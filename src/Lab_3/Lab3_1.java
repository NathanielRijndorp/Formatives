package Lab_3;

import javax.swing.*;

public class Lab3_1 {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        String name = "Nathaniel P. Rijndorp";
        String str1 = "God is real";
        String str2 = "UNLESs";
        byte str1_len = (byte) str1.length();
        byte str2_len = (byte) str2.length();


        //Display
        //First 6
        JOptionPane.showMessageDialog(null, new JTextArea(String.valueOf(str1.charAt(7))), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(String.valueOf(str2.indexOf("s"))), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(str1.toUpperCase()), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(str2.toLowerCase()), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(str1.replaceAll("[aeiouAEIOU]", "x")), name, 1);
        str1 = str1.replaceAll("[aeiouAEIOU]", "x");
        String str_comb = str1 + " " + str2;
        JOptionPane.showMessageDialog(null, new JTextArea("String 1 length: " + str1_len + "\nString 2 length: " + str2_len), name, 1);

        //Second 5
        String input;
        input = JOptionPane.showInputDialog(null, new JTextArea("Input your sentence: ") , name, 1);
        input = str_comb + input;
        byte strComb_len = (byte) str_comb.length();
        StringBuilder builder = new StringBuilder(str_comb);
        String as = "", an = "";
        if (input.contains("an integer")) {
            an = "Sentence contains the word an integer";
        } else {
            an = "Sentence does not contain the word an integer";
        }
        if (str_comb.contains(" as ")) {
            as = "Sentence contains the word as.";
        } else {
            as = "Sentence does not contain the word as.";
        }
        JOptionPane.showMessageDialog(null, new JTextArea(str_comb), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(String.valueOf(strComb_len)), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(an), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(as), name, 1);
        JOptionPane.showMessageDialog(null, new JTextArea(builder.reverse().toString()), name, 1);
    }
}
