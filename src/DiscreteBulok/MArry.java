package DiscreteBulok;

import java.util.Scanner;

public class MArry {
    public static void main(String[] args) {
        int times_printed = 0;
        int num_print = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("input leaves");
        int leaves = sc.nextInt();
        System.out.println("m arry value");
        int inc = sc.nextInt();
        int max = (inc*leaves/(inc-1));
        while (num_print < max) {
            num_print = num_print + inc;
            times_printed++;
            System.out.println("number of vertices: " + num_print + " \npeople who distributed: " + times_printed);
        }
    }
}
