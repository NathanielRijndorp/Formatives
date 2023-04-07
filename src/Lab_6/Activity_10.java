package Lab_6;

import javax.swing.*;
import java.util.Arrays;

public class Activity_10 {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp", pet_list = "", find_pet = "", pet_rename = "";
        String pet[]=new String[10];
        int matching = 0;
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
        find_pet = String.valueOf(JOptionPane.showInputDialog(null, "Insert pet name to remove: ", author, JOptionPane.INFORMATION_MESSAGE));
        pet_exist = false;
        for (int i = 0; i < pet.length; i++) {
            if (pet[i].equalsIgnoreCase(find_pet)) {
                pet_exist = true;
                matching++;
                System.out.println(matching);
            }
        }
        String pet_shit = "";
        String[] pet_delete = new String[matching];
        System.out.println(Arrays.toString(pet_delete));
        int counter = 0;
        for (int i = 0; i < pet.length; i++) {
            if (!pet[i].equalsIgnoreCase(find_pet)) {
              pet_delete[counter] = pet[i];
              pet_shit +=  " " + pet_delete[counter];
              counter++;
            }
        }
        if (!pet_exist) {
            JOptionPane.showMessageDialog(null, "Pet names are:" + pet_list + "\nSearch a value: " + find_pet + "\n" + find_pet + " is NOT Found", author, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Old Pet names are:" + pet_list + "\nNew Pet names are:" + pet_shit, author, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
