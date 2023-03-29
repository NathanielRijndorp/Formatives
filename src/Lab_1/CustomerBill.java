package Lab_1;

import java.util.*;
public class CustomerBill {

    public static void main(String[] args) { //Nathaniel P. Rijndorp
        Scanner scnr = new Scanner(System.in);
        System.out.println("Brand: ");
        String brand = scnr.nextLine();
        System.out.println("Color: ");
        String color = scnr.nextLine();
        System.out.println("Price: ");
        int price = scnr.nextInt();
        System.out.println("Quantity: ");
        int quantity = scnr.nextInt();
        final float vat = 0.038f;
        float grossTotal = price*quantity;
        float grossVat = grossTotal*vat;
        float netTotal = grossTotal+grossVat;
        String strGTotal = String.format("Gross Total\t\t: %.2f",grossTotal);
        String strVat = String.format("Vat\t\t\t\t: %.2f",grossVat);
        String strNTotal = String.format("Net Total\t\t: %.2f",netTotal);

        System.out.println("Nathaniel P. Rijndorp");
        System.out.println("--------------------------------");
        System.out.println(strGTotal);
        System.out.println(strVat);
        System.out.println(strNTotal);
        System.out.println("--------------------------------");
    }

}
