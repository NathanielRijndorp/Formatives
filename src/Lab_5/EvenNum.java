package Lab_5;

public class EvenNum {
    public static void main(String[] args) {
        // variables
        int while_num = 0, do_while_num = 0;
        // util
        System.out.println("Created by: Nathaniel P. Rijndorp");
        for (int for_num = 0; for_num < 52; for_num+=2) {
            if (for_num == 0) {
                System.out.println("---Using For Loop---");
            }
            if (for_num > 0) {
                System.out.print(for_num + " ");
            }
        }
        while (while_num < 50) {
            if (while_num == 0) {
                System.out.println("\n---Using While Loop---");
            }
            while_num+= 2;
            System.out.print(while_num + " ");
        }
        do {
            if (do_while_num == 0) {
                System.out.println("\n---Using Do-While Loop---");
            }
            do_while_num+= 2;
            System.out.print(do_while_num + " ");
        } while (do_while_num < 50);
    }
}
