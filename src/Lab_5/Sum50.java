package Lab_5;

public class Sum50 {
    public static void main(String[] args) {
        // variables
        int tracker = 0, num = 0;
        // util
        System.out.println("Created by: Nathaniel P. Rijndorp");
        while (tracker < 50) {
            tracker++;
            num+=tracker;
        }
        System.out.println("The sum of the numbers from 1 to 50 is: " + num);
    }
}
