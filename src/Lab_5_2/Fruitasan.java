package Lab_5_2;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Fruitasan {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        String fruitasan =
                "Fruits January February March April May\n" +
                "Apple 34 108 99 150 123\n" +
                "Mango 234 186 80 50 343\n" +
                "Banana 734 218 69 350 693";
        String splitter = "\\s{1,}";
        String months[] = new String[5];
        int x_counter = 0, y_counter = 1;
        int[][] prices = new int[3][5];
        int[] most_sold = new int[5]; int  month_fruit[] = new int[5];
        File file = new File("fruits.txt");
        String[] fruit = new String[3];
        try {
            FileWriter fwriter = new FileWriter(file, false);
            fwriter.write(fruitasan);
            fwriter.close();
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                if (x_counter == 0) {
                    String[] splitTxt = myReader.nextLine().split(splitter);
                    for (int i = 0; i < 5; i++) {
                        months[i] = splitTxt[i+1];
                    }
                }
                String[] splitTxt = myReader.nextLine().split(splitter);
                fruit[x_counter] = splitTxt[0];
                for (int i = 0; i < prices[0].length; i++) {
                    prices[x_counter][i] = Integer.parseInt(splitTxt[y_counter++]);
                }
                y_counter = 1;
                x_counter++;
            }
        } catch (Exception e) {
        }
        for (int k = 0; k < prices.length; k++) {
            for (int g = 0; g < months.length; g++) {
                if (prices[k][g] > most_sold[g]) {
                    if (prices[k][g] > most_sold[k]) {
                        most_sold[k] = prices[k][g];
                    }
                }
                if (most_sold[k] == prices[k][g]) {
                    month_fruit[k] = g;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Display the total number of sold per fruit from January to May." +
                        "\n" + fruit[0] + " sold is: " + (prices[0][0]+prices[0][1]+prices[0][2]+prices[0][3]+prices[0][4]) +
                        "\n" + fruit[1] + " sold is: " + (prices[1][0]+prices[1][1]+prices[1][2]+prices[1][3]+prices[1][4]) +
                        "\n" + fruit[2] + " sold is: " + (prices[2][0]+prices[2][1]+prices[2][2]+prices[2][3]+prices[2][4]),
                        author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Display what month has the most sold Apple, Mangoes, and Banana" +
                        "\n" + fruit[0] + " month with most sold: " + months[month_fruit[0]] +
                        "\n" + fruit[1] + " month with most sold: " + months[month_fruit[1]] +
                        "\n" + fruit[2] + " month with most sold: " + months[month_fruit[2]]
                , author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Display total sales of fruits.\n" +
                        ((float)((prices[0][0]+prices[0][1]+prices[0][2]+prices[0][3]+prices[0][4])*16.78)+((prices[1][0]+prices[1][1]+prices[1][2]+ prices[1][3]+ prices[1][4])*14.50)+((prices[2][0]+prices[2][1]+prices[2][2]+ prices[2][3]+prices[2][4])*7.89))
                , author, JOptionPane.INFORMATION_MESSAGE);
    }
}
