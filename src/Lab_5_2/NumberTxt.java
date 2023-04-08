package Lab_5_2;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberTxt {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        String num = """
                11 -34 56 78 -90 12 13 1 8 56
                89 99 -43 14 3 15 -3 89 78 9
                16 78 90 78 67 12 -23 12 90 8
                2 4 67 -69 45 13 87 14 19 -91
                14 67 -89 65 -13 -18 19 90 99 100""";
        String numbers = "All the numbers!", numbers_odd = "", numbers_even = "";
        int sum_first_row = 0, sum_second_row = 0, sum_third_row = 0, sum_fourth_row = 0, sum_fifth_row = 0, sumAll;
        float avg_first_row, avg_second_row, avg_third_row, avg_fourth_row, avg_fifth_row, avgAll;
        int[] lowest = new int[5];
        int highest_of_all = 0, lowest_of_all = 0;
        int odd_sum = 0, even_sum = 0;
        int row_length = 0;
        int[][] number = new int[10][5];
        String divisible_5 = "";
        String display_negative = "";
        String splitter = "\\s{1,}";
        //util
        File file = new File("Numbers.txt");
        try {
            FileWriter fwriter = new FileWriter(file, false);
            fwriter.write(num);
            fwriter.close();
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String[] splitTxt = myReader.nextLine().split(splitter);
                numbers +=  "\n" + splitTxt[0] + "  " + splitTxt[1] + "  " + splitTxt[2] + "  " +splitTxt[3] + "  " +splitTxt[4] + "  " +splitTxt[5] + "  " + splitTxt[6] + "  " + splitTxt[7] + "  " + splitTxt[8] + "  " +splitTxt[9];
                number[0][row_length] = Integer.parseInt(splitTxt[0]);number[1][row_length] = Integer.parseInt(splitTxt[1]);number[2][row_length] = Integer.parseInt(splitTxt[2]);number[3][row_length] = Integer.parseInt(splitTxt[3]);number[4][row_length] = Integer.parseInt(splitTxt[4]);
                number[5][row_length] = Integer.parseInt(splitTxt[5]);number[6][row_length] = Integer.parseInt(splitTxt[6]);number[7][row_length] = Integer.parseInt(splitTxt[7]);number[8][row_length] = Integer.parseInt(splitTxt[8]);number[9][row_length] = Integer.parseInt(splitTxt[9]);
                for (int r = 0; r < number.length; r++) {
                    divisible_5 += number[r][row_length]%5 == 0 ? (number[r][row_length]) + " " : "";
                    display_negative += number[r][row_length] < 0 ? (number[r][row_length]) + " " : "";
                    numbers_odd += number[r][row_length]%2 == 1 ? (number[r][row_length]) + " " : "";
                    numbers_odd += number[r][row_length]%2 == -1 ? (number[r][row_length]) + " " : "";
                    numbers_even += number[r][row_length]%2 == 0 ? (number[r][row_length]) + " " : "";
                    odd_sum += number[r][row_length]%2 == 1 ? number[r][row_length] : 0;
                    odd_sum += number[r][row_length]%2 == -1 ? number[r][row_length] : 0;
                    even_sum += number[r][row_length]%2 == 0 ? number[r][row_length] : 0;
                }
                row_length++;
            }
            myReader.close();
        } catch (Exception e){
            System.out.println("No.");
        }
        for (int r = 0; r < number.length; r++) {
            sum_first_row += number[r][0] ; sum_second_row += number[r][1];
            sum_third_row += number[r][2] ; sum_fourth_row += number[r][3];
            sum_fifth_row += number[r][4] ;
        }
        for (int[] ints : number) {
            for (int g = 0; g < lowest.length; g++) {
                if (ints[g] < lowest[g]) {
                    lowest[g] = ints[g];
                }
                if (ints[g] > highest_of_all) {
                    highest_of_all = ints[g];
                }
                lowest_of_all = Math.min(lowest[g], lowest_of_all);
            }
        }
        // sum all
        sumAll = sum_first_row + sum_second_row + sum_third_row + sum_fourth_row + sum_fifth_row;
        // avg all
        avgAll = (float) sumAll/50;
        // avg row
        avg_first_row = (float) sum_first_row / number.length;
        avg_second_row = (float) sum_second_row / number.length;
        avg_third_row = (float) sum_third_row / number.length;
        avg_fourth_row = (float) sum_fourth_row / number.length;
        avg_fifth_row = (float) sum_fifth_row / number.length;
        JOptionPane.showMessageDialog(null, numbers, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The total sum & average: \n" + "Sum: " + sumAll + "\nAvg:" + avgAll, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Odd Numbers & their sum:\n" + numbers_odd + "\nSum: " + odd_sum, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Even Numbers & their sum:\n" + numbers_even + "\nSum: " + even_sum, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sum of row & average of row:\nFirst row:\n" + sum_first_row + "\nAverage: \n" + avg_first_row +
                "\nSecond row:\n" + sum_second_row + "\nAverage: \n" + avg_second_row +
                "\nThird row:\n" + sum_third_row + "\nAverage: \n" + avg_third_row +
                "\nFourth row:\n" + sum_fourth_row + "\nAverage: \n" + avg_fourth_row +
                "\nFifth row:\n" + sum_fifth_row + "\nAverage: \n" + avg_fifth_row, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Lowest number from:" +
                "\nRow 1: " + lowest[0] +
                "\nRow 2: " + lowest[1] +
                "\nRow 3: " + lowest[2] +
                "\nRow 4: " + lowest[3] +
                "\nRow 5: " + lowest[4], author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Lowest of all: " + lowest_of_all + "\nHighest of all: " + highest_of_all, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Divisible by 5: " + divisible_5, author, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "All negatives "+ display_negative, author, JOptionPane.INFORMATION_MESSAGE);
    }
}
