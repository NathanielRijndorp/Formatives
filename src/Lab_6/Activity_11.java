package Lab_6;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Activity_11 {
    public static void main(String[] args) {
        String author = "Created by: Nathaniel P. Rijndorp";
        String fruitasan = "Mon Tue Wed Thurs Fri\n" +
                "Mango 12 14 17 19 5 \n" +
                "Durian 5 7 10 3 0\n" +
                "Banana 15 12 18 19 12";
        String splitter = "\\s{1,}";
        String[] day = new String[5];
        String[] fruit = new String[3];
        String[] date_fruit_sold = {"","","","",""};
        int[] total_sold = new int[3];
        float[] total_price = new float[3];
        float[] fruit_price = {45.00f,78.97f,5.67f};
        String[][] item_sold = new String[3][5];
        float overall_sales = 0;
        File file = new File("fruitss");
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(fruitasan);
            writer.close();
            Scanner scan = new Scanner(file);
            for (int i = 0; i < 5; i++) {
                String[] splitTxt = scan.nextLine().split(splitter);
                if (i == 0) {
                    for (int x = 0; x < day.length; x++) {
                        day[x] = splitTxt[x];
                    }
                } else {
                    fruit[i-1] = splitTxt[0];
                    for (int x = 0; x < 5; x++) {
                        item_sold[i-1][x] = splitTxt[x+1];
                    }
                }
            }
        } catch (Exception e) {
        }
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 5; x++) {
                total_sold[i] += Integer.parseInt(item_sold[i][x]);
                date_fruit_sold[i] += "\n"+ (day[x] + " sold " + item_sold[i][x] + " " + fruit[i]);
            }
            total_price[i] = (float) total_sold[i] * fruit_price[i];
            overall_sales += total_price[i];
        }
        JOptionPane.showMessageDialog(null, "Mangoes sold: " + total_sold[0] + " Total cost: " + total_price[0] +
                "\nDurians sold: " + total_sold[1] + " Total cost: " + total_price[1] +
                "\nBananas sold: " + total_sold[2] + " Total cost: " + total_price[2] + "\n" +
                date_fruit_sold[0] + "\n" +
                date_fruit_sold[1] + "\n" +
                date_fruit_sold[2] + "\n" +
                "\nOverall sales are: " + overall_sales, author, JOptionPane.INFORMATION_MESSAGE);
    }
}

