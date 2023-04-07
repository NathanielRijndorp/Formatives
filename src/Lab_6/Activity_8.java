package Lab_6;

import javax.swing.*;

public class Activity_8 {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp", pet_list = "", find_pet = "", found_at = "";
        String pet[]=new String[10];
        for (int i = 0; i < pet.length; i++) {
            pet[i] = String.valueOf(JOptionPane.showInputDialog(null, "Enter pet name: ", author, JOptionPane.INFORMATION_MESSAGE));
            pet_list += " " + pet[i];
        }
        find_pet = String.valueOf(JOptionPane.showInputDialog(null, "Insert pet to find: ", author, JOptionPane.INFORMATION_MESSAGE));
        for (int i = 0; i < pet.length; i++) {
            if (pet[i].equalsIgnoreCase(find_pet)) {
                found_at += " " + i   ;
            }
        }
        if (found_at.equals("")) {
            JOptionPane.showMessageDialog(null, "Pet names are:" + pet_list + "\nSearch a value: " + find_pet + "\n" + find_pet + " is NOT Found", author, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pet names are:" + pet_list + "\nSearch a value: " + find_pet + "\n" + find_pet + " is found at index/indices:" + found_at, author, JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
