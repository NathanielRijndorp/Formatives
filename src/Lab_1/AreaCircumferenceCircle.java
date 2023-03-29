package Lab_1;

import java.util.*;
public class AreaCircumferenceCircle {
    public static void main(String[] args) { //Nathaniel P. Rijndorp
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter radius: ");
        final double pi = 3.14;
        double r = scnr.nextFloat();
        double a = pi*(r*r);
        double c = (2*pi)*r;

        System.out.println("Nathaniel P. Rijndorp");
        System.out.println("Area is: " + a);
        System.out.println("Circumference is: " + c);

    }
}