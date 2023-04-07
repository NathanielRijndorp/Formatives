package Lab_6;

import javax.swing.*;

public class Activity_9 {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp", pet_list = "", find_pet = "", found_at = "", pet_rename = "";
        String pet[]=new String[10];
        boolean pet_exist = false;
        for (int i = 0; i < pet.length; i++) {
            pet[i] = String.valueOf(JOptionPane.showInputDialog(null, "Enter pet name: ", author, JOptionPane.INFORMATION_MESSAGE));
            pet_list += " " + pet[i];
        }
        JOptionPane.showMessageDialog(null, "Pet names are: " + pet_list, author, JOptionPane.INFORMATION_MESSAGE);
        find_pet = String.valueOf(JOptionPane.showInputDialog(null, "Insert pet name to change: ", author, JOptionPane.INFORMATION_MESSAGE));
        pet_rename = String.valueOf(JOptionPane.showInputDialog(null, "Insert new name: ", author, JOptionPane.INFORMATION_MESSAGE));
        for (int i = 0; i < pet.length; i++) {
            if (pet[i].equalsIgnoreCase(find_pet)) {
                pet[i] = pet_rename;
                pet_exist = true;
            }
        }
        pet_list = "";
        for (int i = 0; i < pet.length; i++) {
            pet_list += " " + pet[i];
        }
        if (!pet_exist) {
            JOptionPane.showMessageDialog(null, "Pet names are:" + pet_list + "\nSearch a value: " + find_pet + "\n" + find_pet + " is NOT Found", author, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pet names are:" + pet_list, author, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
