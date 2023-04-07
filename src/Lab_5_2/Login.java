package Lab_5_2;

import javax.swing.*;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        String password = "pwd123", username = "admin", fail_login = "Log-in failed", success_login = "Log-in successful";
        boolean has_Attempt = true;
        int att = 3, counter = 3;
        // util
        // COUNTER
        for (int i = 0; i < counter; ) {
            String user_login = String.valueOf(JOptionPane.showInputDialog(null, "CNTR Enter username: ", author, JOptionPane.QUESTION_MESSAGE));
            String user_pass = String.valueOf(JOptionPane.showInputDialog(null, "Enter password: ", author, JOptionPane.QUESTION_MESSAGE));
            counter--;
            if (user_login.equals(username)) {
                if (user_pass.equals(password)) {
                    JOptionPane.showMessageDialog(null, success_login, author, JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, fail_login + "! You have " + counter + " attempt(s) left!", author, JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, fail_login + "! You have " + counter + " attempt(s) left!", author, JOptionPane.WARNING_MESSAGE);
            }
            if (counter == 0) {
                JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating...", author, JOptionPane.WARNING_MESSAGE);
            }
            System.out.println(i);
        }
        // SENTINEL
        while (!(att == 0)) {
            String user_login = String.valueOf(JOptionPane.showInputDialog(null, "SENT Enter username: ", author, JOptionPane.QUESTION_MESSAGE));
            String user_pass = String.valueOf(JOptionPane.showInputDialog(null, "Enter password: ", author, JOptionPane.QUESTION_MESSAGE));
            if (user_login.equals(username)) {
                if (user_pass.equals(password)) {
                    JOptionPane.showMessageDialog(null, success_login, author, JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    att--;
                    JOptionPane.showMessageDialog(null, fail_login + "! You have " + att + " left!", author, JOptionPane.WARNING_MESSAGE);
                }
            } else {
                att--;
                JOptionPane.showMessageDialog(null, fail_login + "! You have " + att + " left!", author, JOptionPane.WARNING_MESSAGE);
            }
            if (att == 0) {
                JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating...", author, JOptionPane.WARNING_MESSAGE);
            }
        }
        // FLAG
        att = 3;
        while (has_Attempt) {
            String user_login = String.valueOf(JOptionPane.showInputDialog(null, "FLAG Enter username: ", author, JOptionPane.QUESTION_MESSAGE));
            String user_pass = String.valueOf(JOptionPane.showInputDialog(null, "Enter password: ", author, JOptionPane.QUESTION_MESSAGE));
            att--;
            if (user_login.equals(username)) {
                if (user_pass.equals(password)) {
                    JOptionPane.showMessageDialog(null, success_login, author, JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, fail_login + "! You have " + att + " left!", author, JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, fail_login + "! You have " + att + " left!", author, JOptionPane.WARNING_MESSAGE);
            }
            if (att == 0) {
                JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating...", author, JOptionPane.WARNING_MESSAGE);
                has_Attempt = false;
            }
        }
        // EOF
        String tries = "2 1 0";
        Scanner scanner = new Scanner(tries);
        while (scanner.hasNext()) {
            String user_login = String.valueOf(JOptionPane.showInputDialog(null, "EOF Enter username: ", author, JOptionPane.QUESTION_MESSAGE));
            String user_pass = String.valueOf(JOptionPane.showInputDialog(null, "Enter password: ", author, JOptionPane.QUESTION_MESSAGE));
            String test = scanner.next();
            if (user_login.equals(username)) {
                if (user_pass.equals(password)) {
                    JOptionPane.showMessageDialog(null, success_login, author, JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, fail_login + "! You have " + test + " left!", author, JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, fail_login + "! You have " + test + " left!", author, JOptionPane.WARNING_MESSAGE);
            }
            if (!scanner.hasNext()) {
                JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating...", author, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
