package Lab_5_1;

public class TableOfSquares {
    public static void main(String[] args) {
        // variables
        int while_num = 0, do_while_num = 0;
        //util
        System.out.println("Created by: Nathaniel P. Rijndorp");
        for (int for_num = 1; for_num < 21; for_num++) {
            if (for_num == 0) {
                System.out.println("---Using For Loop---\n");
            }
            System.out.print("\nNumber:" + for_num + " Square: " + (for_num*for_num));
        }
        while (while_num < 20) {
            if (while_num == 0) {
                System.out.print("\n\n---Using While Loop---\n");
            }
            while_num++;
            System.out.print("\nNumber: " + while_num + " Square: " + (while_num*while_num));
        }
        do {
            if (do_while_num == 0) {
                System.out.print("\n\n---Using Do-While Loop---\n");
            }
            do_while_num++;
            System.out.print("\nNumber: " + do_while_num + " Square: " + (do_while_num*do_while_num));
        } while (do_while_num < 20);
    }
}
