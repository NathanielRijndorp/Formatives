package Lab_5_2;

import javax.swing.*;

public class Sentinel {
    public static void main(String[] args) {
        // variables
        String author = "Created by Nathaniel P. Rijndorp";
        String num = "", odd_num = "", even_num = "";
        int odd_count = 0, even_count = 0;
        int odd = 0, even = 0;
        int num_loop = 0;
        String input = "";

                    // util
            while (num_loop == 0) {
                input += String.valueOf(JOptionPane.showInputDialog(null, new JTextArea("Enter number:"), author , 1));
                if (input.contains("0")) {
                    num_loop++;
                }
                if (input.matches("[a-z,A-Z$&+:;=?@#|'<>.^*()%!-]")) {
                    JOptionPane.showMessageDialog(null, new JTextArea("ERROR! MUST ONLY BE NUMBERS! INPUT WILL BE RESET!"), author, JOptionPane.WARNING_MESSAGE);
                    input = "";
                }
                System.out.println(input);
            }
            for (int i = 0; input.length()>i; i++) {
                if (String.valueOf(input.charAt(i)).matches("[123456789]")) {
                    num += String.valueOf(input.charAt(i)) + " ";
                }
                if (String.valueOf(input.charAt(i)).matches("[13579]")) {
                    odd_num += String.valueOf(input.charAt(i)) + " ";
                    odd_count++;
                }
                if (String.valueOf(input.charAt(i)).matches("[2468]")) {
                    even_num += String.valueOf(input.charAt(i)) + " ";
                    even_count++;
            }
        }
        String output = String.format("If the inputs are\t: " + input +
                    "\nNumbers\t: " + num +
                    "\nOdd numbers\t: " + odd_num +
                    "\nEven numbers\t: " + even_num +
                    "\nOdd count\t: " + odd_count +
                    "\nEven count\t: " + even_count);
        JOptionPane.showMessageDialog(null, new JTextArea(output), author, 1);
    }
}
