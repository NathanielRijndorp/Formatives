package Lab_5_2;

import javax.swing.*;

public class HappyMeal {
    public static void main(String[] args) {
        // variables
        String author = "Created by Nathaniel P. Rijndorp";
        String input = "", order_At = "";
        int order_1 = 0, order_2 = 0, order_3 = 0, order_4 = 0, order_5 = 0, order_6 = 0, order_7 = 0, order_8 = 0, order_9 = 0;
        int str_val = 0, cost = 0, change = 0;
        // util
        while (!input.matches("0")) {
            input = String.valueOf(JOptionPane.showInputDialog(null, "Please select out of the 10 choices:" +
                            "\n[1] Combo Meal 1 – (1 Rice, 2 Viands, 1 glass coke for 75.00 PHP)" +
                            "\n[2] Combo Meal 2 - (1 Rice, 2 Viands for 50.00 PHP)" +
                            "\n[3] Combo Meal 3 - (1 Rice, 1 Viand 30.00 PHP)" +
                            "\n[4] Combo Meal 4 – Exotic Foods (1 Rice + Piniritong Butiki 80.00 PHP)" +
                            "\n[5] Combo Meal 5 – Exotic Foods (1 Rice + Sinugbang Panga sa ginamos 100.00 PHP )" +
                            "\n[6] Combo Meal 6 – Exotic Foods (1 Rice + Sinigang na Ilaga 150.00 php" +
                            "\n[7] Soft drinks 15.00 php" +
                            "\n[8] Rice 7.00 php" +
                            "\n[9] Tindera 10.00 php" +
                            "\n[0] Exit"
                    , author, JOptionPane.QUESTION_MESSAGE));
            str_val = Integer.parseInt(String.valueOf(input));
            if (str_val > 9 || str_val < 0) {
                JOptionPane.showMessageDialog(null, "INVALID INPUT! ORDER RESET...", author, JOptionPane.WARNING_MESSAGE);
                cost = 0; order_1 = 0;order_2 = 0;order_3 = 0;order_4 = 0;order_5 = 0;order_6 = 0;order_7 = 0;order_8 = 0;order_9 = 0;
            } else {
                if (input.contains("1") ) {
                    cost+=75;order_1++;
                }
                if (input.contains("2") ) {
                    cost+=50;order_2++;
                }
                if (input.contains("3") ) {
                    cost+=30;order_3++;
                }
                if (input.contains("4") ) {
                    cost+=80;order_4++;
                }
                if (input.contains("5") ) {
                    cost+=100;order_5++;
                }
                if (input.contains("6") ) {
                    cost+=150;order_6++;
                }
                if (input.contains("7") ) {
                    cost+=15;order_7++;
                }
                if (input.contains("8") ) {
                    cost+=7;order_8++;
                }
                if (input.contains("9") ) {
                    cost+=10;order_9++;
                }
            }
        }
        int money = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter money", author, JOptionPane.QUESTION_MESSAGE));
        if (cost <= money) {
            change = money-cost;
            System.out.println(order_1);
            JOptionPane.showMessageDialog(null, new JTextArea("----------Mapua Cafeteria----------" +
                    "\nYour order consists of:" +
                    "\nMenu Option 1\t: " + order_1 +
                    "\nMenu Option 2\t: " + order_2 +
                    "\nMenu Option 3\t: " + order_3 +
                    "\nMenu Option 4\t: " + order_4 +
                    "\nMenu Option 5\t: " + order_5 +
                    "\nMenu Option 6\t: " + order_6 +
                    "\nMenu Option 7\t: " + order_7 +
                    "\nMenu Option 8\t: " + order_8 +
                    "\nMenu Option 9\t: " + order_9 +
                    "\nTotalling\t: " + cost +
                    "\nPayment\t: " + money +
                    "\nChange\t: " + change +
                    "\n----------Mapua Cafeteria----------"
                            ), author, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Order could not be fulfilled. Not enough money", author, JOptionPane.WARNING_MESSAGE);
        }
    }
}
