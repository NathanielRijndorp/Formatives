package Lab_9;

import javax.swing.*;
import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Customer {
    public static void main(String[] args) {
        String menu[]={"[A]dd Customer","[V]iew Customer","[S]earch Customer","[E]dit Customer", "[D]elete Customer", "[E]nd"};
        int MAX=10, index=0;
        int customer_id[]=new int[MAX];
        int customer_id2[]=new int[MAX];
        String customer_name[]=new String[MAX];
        String customer_name2[]=new String[MAX];
        String customer_gender[]=new String[MAX];
        String customer_gender2[]=new String[MAX];
        int customer_age[]=new int[MAX];
        int customer_age2[]=new int[MAX];
        boolean id_checker = false;
        boolean invalid_checker = false;
        int edit_id = 0;
        int find_id = 0;
        int del_id = 0;
        String choice="";
        do{
            invalid_checker = false;
            try {
                choice= JOptionPane.showInputDialog(null, "Please Select", "Menu",
                        1,null,menu,menu[0]).toString();
            } catch (NullPointerException n) {
                choice="[E]nd";
            }
            switch(choice){
                case "[A]dd Customer":
                    try {
                        do {
                            System.out.println("hala");
                            customer_id[index] = Integer.parseInt(JOptionPane.showInputDialog("Customer Id: "));
                            for (int g = 0; g < index; g++) {
                                if (customer_id[index] == customer_id[g]) {
                                    id_checker = true;
                                    JOptionPane.showMessageDialog(null, "Customer Ids must be unique.");
                                    break;
                                } else if (!(customer_id[index] == customer_id[g])) {
                                    id_checker = false;
                                }
                            }
                        } while (id_checker);
                        id_checker = false;
                        customer_name[index] = JOptionPane.showInputDialog("Customer Name: ");
                        customer_age[index] = Integer.parseInt(JOptionPane.showInputDialog("Customer Age: "));
                        customer_gender[index] = JOptionPane.showInputDialog("Customer Gender: ");
                    } catch (Exception e) {
                        invalid_checker = true;
                        customer_id[index] = 0;
                        customer_name[index] = null;
                        customer_gender[index] = null;
                        customer_age[index] = 0;
                        JOptionPane.showMessageDialog(null, "Invalid input!");
                    }
                    if (!invalid_checker) {
                        JOptionPane.showMessageDialog(null, "Added new customer successfully");
                        index++;
                    }
                    break;
                case "[V]iew Customer":
                    if (index == 0) {
                        JOptionPane.showMessageDialog(null, "No customer data available!");
                        break;
                    }
                    String all="Customer's Info\nID\tName\tGender\tAge\n";
                    for(int x=0;x<index;x++){
                        all=all+customer_id[x]+"\t"+customer_name[x]+"\t"+customer_gender[x]+"\t"+customer_age[x]+"\n";
                    }
                    JOptionPane.showMessageDialog(null, new JTextArea(all));
                    break;
                case "[S]earch Customer":
                    if (index == 0) {
                        JOptionPane.showMessageDialog(null, "No customer data available!");
                        break;
                    }
                    try {
                        find_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Select Customer ID to edit."));
                    } catch (NumberFormatException f) {
                        JOptionPane.showMessageDialog(null, "Invalid input!");
                        break;
                    }
                    for (int i = 0; i < index; i++) {
                        if (find_id == customer_id[i]) {
                            JOptionPane.showMessageDialog(null, "Selected ID number: " + find_id + "'s credentials are: \nName: " + customer_name[i] + " Age "
                                    + customer_age[i] + " Gender " + customer_gender[i]);
                            break;
                        }
                        if (i+1 == index) {
                            JOptionPane.showMessageDialog(null, "Selected ID number: " + find_id + " is not FOUND!");
                        }
                    }
                    break;
                case "[E]dit Customer":
                    if (index == 0) {
                        JOptionPane.showMessageDialog(null, "No customer data available!");
                        break;
                    }
                    try {
                        edit_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Select Customer ID to edit."));
                    } catch (NumberFormatException f) {
                        JOptionPane.showMessageDialog(null, "Invalid input!");
                        break;
                    }
                    for (int i = 0; i < index; i++) {
                        if (edit_id == customer_id[i]) {
                            String temp_name = customer_name[i];
                            int temp_age = customer_age[i];
                            String temp_gender = customer_gender[i];
                            JOptionPane.showMessageDialog(null, "Selected ID number: " + edit_id);
                            try {
                                customer_name[i] = JOptionPane.showInputDialog("New Customer Name: ");
                                customer_age[i] = Integer.parseInt(JOptionPane.showInputDialog("New Customer Age: "));
                                customer_gender[i] = JOptionPane.showInputDialog("New Customer Gender: ");
                            } catch (Exception e) {
                                customer_name[i] = temp_name;
                                customer_age[i] = temp_age;
                                customer_gender[i] = temp_gender;
                                JOptionPane.showMessageDialog(null, "Invalid input!");
                            }
                            break;
                        }
                        if (i+1 == index) {
                            JOptionPane.showMessageDialog(null, "Selected ID number: " + edit_id + " is not FOUND!");
                        }
                    }
                    break;
                case "[D]elete Customer":
                    if (index == 0) {
                        JOptionPane.showMessageDialog(null, "No customer data available!");
                        break;
                    }
                    try {
                        del_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Select Customer ID to delete."));
                    } catch (NumberFormatException f) {
                        JOptionPane.showMessageDialog(null, "Invalid input!");
                        break;
                    }
                    int counter = 0;
                    for (int i = 0; i < index; i++) {
                        if (!(del_id == customer_id[i])) {
                            customer_id2[counter] = customer_id[i];
                            customer_id[counter] = customer_id2[counter];
                            customer_name2[counter] = customer_name[i];
                            customer_name[counter] = customer_name2[counter];
                            customer_age2[counter] = customer_age[i];
                            customer_age[counter] = customer_age2[counter];
                            customer_gender2[counter] = customer_gender[i];
                            customer_gender[counter] = customer_gender2[counter];
                            counter++;
                        }
                        if (del_id == customer_id[i]) {
                            index--;
                        }
                    }
                    if (counter == 0) {
                        JOptionPane.showMessageDialog(null, "Selected ID number: " + del_id + " is not FOUND!");
                    }
                    break;
            }
        } while(!choice.equals("[E]nd"));
    }
}
