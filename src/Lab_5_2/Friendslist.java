package Lab_5_2;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Friendslist {
    public static void main(String[] args) {
        // variables
        String author = "Created by Nathaniel P. Rijndorp";
        String name = "", birthday = "", gender = "", age = "", contact = "", remarks = "", list = "", above_age = "", friend = "";
        String[] friendType = { "Friend", "Unfriend"};
        int friend_val = 0, age_num = 0;
        boolean add_friend = true;
        boolean first_line = true;
        File file_friendslist = new File("phonebook.txt");
        int task = 0;
        String splitter = "\\s{4,}";
        while (add_friend) {
            name = "\n" + String.valueOf(JOptionPane.showInputDialog(null, "Name:", author, JOptionPane.QUESTION_MESSAGE)) + "\t\t\t\t";
            birthday = String.valueOf(JOptionPane.showInputDialog(null, "Birthday:", author, JOptionPane.QUESTION_MESSAGE)) + "\t\t\t\t\t";
            gender = String.valueOf(JOptionPane.showInputDialog(null, "Gender:", author, JOptionPane.QUESTION_MESSAGE)) + "\t\t\t\t\t";
            age = String.valueOf(JOptionPane.showInputDialog(null, "Age:", author, JOptionPane.QUESTION_MESSAGE));
            contact = "\t\t\t\t\t" + String.valueOf(JOptionPane.showInputDialog(null, "Contact:", author, JOptionPane.QUESTION_MESSAGE)) + "\t\t\t\t\t\t\t";
            friend_val = JOptionPane.showOptionDialog(null, "Remarks:", author, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, friendType, friendType[0]);
            int dialogButton = JOptionPane.showConfirmDialog(null, "Would you like to save your information? This will end the process.", author, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
            age_num = Integer.parseInt(age);
            remarks = friend_val == 0 ? "Friend" : "Unfriend";
            list = String.format(name + " " + birthday + " " + gender + " " + age + " " + contact + " " + remarks);
            try {
                FileWriter fWriter = new FileWriter(file_friendslist, true);
                if (first_line && file_friendslist.length() == 0) {
                    fWriter.write("------------------------Friends List------------------------");
                    fWriter.write("\n\tName\t\t\t\t\t\t\t\t" + "Birthday\t\t\t\t\t\t" + "Gender\t\t\t\t\t" + "Age\t\t\t\t\t" + "Contact\t\t\t\t\t\t\t\t" + "Remarks");
                    first_line = false;
                }
                    fWriter.write(list);
                    fWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            //Reader for friends
            if (friend_val == 0) {
                friend += name + " " + gender + " " + age;
            }
            if (dialogButton == JOptionPane.YES_OPTION) {
                add_friend = false;
                }
            }
        while (task == 0) {
            task = Integer.parseInt(JOptionPane.showInputDialog(null, "Select Task From 1-3:", author, JOptionPane.QUESTION_MESSAGE));
            if (task > 3 || task <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid input!");
                task = 0;
            } else if (task == 1){
                JOptionPane.showMessageDialog(null, "You already do this normally.");
                task = 0;
            } else if (task == 2) {
                //Reader for above age

                try {
                    Scanner myReader = new Scanner(file_friendslist);
                    myReader.nextLine();
                    myReader.nextLine();
                    while (myReader.hasNextLine()) {
                        String[] splitTxt = myReader.nextLine().split(splitter);
                        if (Integer.parseInt(splitTxt[3]) >= 18) {
                            above_age +=  "\n" + splitTxt[0] + " " + splitTxt[1] + " " + splitTxt[2] + " " +splitTxt[3] + " " +splitTxt[4] + " " +splitTxt[5];
                        }
                    }
                    System.out.println(above_age);
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "People who are 18 and above.\n" + above_age, author, JOptionPane.INFORMATION_MESSAGE);
                task = 0;
                above_age = "";
            } else if (task == 3) {
                try {
                    Scanner myReader = new Scanner(file_friendslist);
                    myReader.nextLine();
                    myReader.nextLine();
                    while (myReader.hasNextLine()) {
                        String[] txt_split = myReader.nextLine().split(splitter);
                        if (txt_split[5].equalsIgnoreCase("Friend")) {
                            friend += "\n" + txt_split[0] + " " + txt_split[2] + " " + txt_split[3];
                        }
                    }
                    System.out.println(above_age);
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "People who are your friends.\n" + friend, author, JOptionPane.INFORMATION_MESSAGE);
                task = 0;
                friend = "";
            }
        }
    }
}
