package Lab_5_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Fruitasan {
    public static void main(String[] args) {
        // variables
        String author = "Created by: Nathaniel P. Rijndorp";
        String fruitasan = "Fruits January February March April May\n" +
                "Apple 34 108 99 150 123\n" +
                "Mango 234 186 80 50 343\n" +
                "Banana 734 218 69 350 693";
        // util
        File file = new File("Numbers.txt");
        try {
            FileWriter fwriter = new FileWriter(file, false);
            fwriter.write(fruitasan);
            fwriter.close();
            Scanner myReader = new Scanner(file);

        } catch (Exception e){
            System.out.println("No.");
        }

    }
}
