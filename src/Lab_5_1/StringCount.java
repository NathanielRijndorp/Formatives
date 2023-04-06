package Lab_5_1;

import javax.swing.*;

public class StringCount {
    public static void main(String[] args) {
        // variables
        String str_vow = "", str_con = "", str_odd = "", str_even = "", str_special = "", str_zero = "", str_space = "";
        String author = "Created by Nathaniel P. Rijndorp";
        int vowels = 0, consonants = 0, space = 0, zero = 0, odd = 0, even = 0, special = 0, counter = 0;
        // util
        while (counter == 0) {
            String input = String.valueOf(JOptionPane.showInputDialog(null, new JTextArea("Type a word: "), author, 1));
            if (input.length() == 0 || input == "null") {
                JOptionPane.showMessageDialog(null, "WARNING! EMPTY STRING DETECTED! ", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                for (int v = 0; v < input.length(); v++) {
                    str_space = String.valueOf(input.charAt(v));
                    str_vow = String.valueOf(input.charAt(v));
                    str_con = String.valueOf(input.charAt(v));
                    str_zero = String.valueOf(input.charAt(v));
                    str_odd = String.valueOf(input.charAt(v));
                    str_even = String.valueOf(input.charAt(v));
                    str_special = String.valueOf(input.charAt(v));

                    if (str_vow.matches("[aeiouAEIOU]")) {
                        vowels++;
                    }
                    if (str_con.matches("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]")) {
                        consonants++;
                    }
                    if (str_zero.matches("0")) {
                        zero++;
                    }
                    if (str_space.matches(" ")) {
                        space++;
                    }
                    if (str_odd.matches("[13579]")) {
                        odd++;
                    }
                    if (str_even.matches("[2468]")) {
                        even++;
                    }
                    if (str_special.matches("[$&+,:;=?@#|'<>.^*()%!-]")) {
                        special++;
                    }
                }
                String output = String.format("String is\t: " + input +
                        "\nVowels\t: " + vowels +
                        "\nConsonants\t: " + consonants +
                        "\nSpaces\t: " + space +
                        "\nZero\t: " + zero +
                        "\nOdd\t: " + odd +
                        "\nEven\t: " + even +
                        "\nSpecial\t: " + special);
                JOptionPane.showMessageDialog(null, new JTextArea(output) , author,1);
                counter++;
            }
        }
    }
}
