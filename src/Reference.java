import javax.swing.*;
import java.util.Arrays;
import java.util.*;




public class Reference {
    public static void main(String[] args) {
        int i = 1;
        int x = 1;
        int num = 20;
        int count = 10;
        while (count > 1) {
            num = num + 2;
            count--;
        }
        System.out.println(count + " " + num);
        x = 1;
        count = 0;
        for (count = 0; count <= 2; count++) {
            x = x * count;
        }
        System.out.println(x);
        num = 0;
        int sum = 0;
////        String ayawKol = "20 25 10 18 -1";
////        Scanner console = new Scanner(ayawKol);
////        num = console.nextInt();
////        while (num != -1) {
////            if (num >= 20) {
////                sum = sum + num;
////            } else {
////                sum = sum - num;
////            }
////            num = console.nextInt();
////        }
//        System.out.println(num);
//        console.close();
        int[] alpha = new int[5];
        for (int j = 0; j < 5; j++) {
            alpha[j] = j + 1;
            if (j > 2) {
                alpha[j-1] = alpha[j] +j;
            }
        }
        System.out.println(Arrays.toString(alpha));
        int[] list = {0,5,10,15,20};

        for (int j = 0; j < 5; j++) {
            System.out.println(list[j] + " ");
        }
        int[] alpha2 = new int[5];
        for (int j = 4; j >= 0; j--) {
            alpha2[j] = j + 3;
            if (j <= 2) {
                alpha2[j + 1] = alpha2[j] - 1;
            }
        }
        System.out.println(alpha2[3]);
        int[] alpha3 = {1,3,5,7,9};

        for (int j = 4; j >= 0; j--) {
            System.out.print(alpha3[j] + " ");
        }
        int[] alpha4 = new int[5];
        for (int j = 0; j < 5; j++) {
            alpha4[j] = 2 * j;
            if (j % 2 == 1) {
                alpha4[j - 1] = alpha4[j] + j;
            }
        }
        System.out.println(Arrays.toString(alpha4));
        int[] numList = new int[50];

        System.out.println(numList.length);
        char[][] table = new char[10][5];
        System.out.println(table[2].length);

        int[] alpha5 = new int[5];

        for (int j = 4; j >= 0; j--) {
            alpha5[j] = j + 2;
            if ( j <=2) {
                alpha5[j + 1] = alpha5[j] + j;
            }
        }
        System.out.println(alpha5[3]);
//        String yawaaNimoUy = "8 10 6 1 -3 4";
//        Scanner tanginamo = new Scanner(yawaaNimoUy);
//        int sum2 = 0;
//        int num2;
//        int j = 1;
//        while (j <= 5) {
//            num2 = tanginamo.nextInt();
//            if (num < 0) {
//                continue;
//            }
//            sum2 = sum2 + num2;
//            j++;
//        }
//        System.out.println(sum2);
        int gay;
        for (gay = 10; gay <= 10; gay++) {
            System.out.println(gay + " ");
            System.out.println(gay);
        }
//        int sex = 27;
//        int gays = 0;
//
//        do {
//            sex = sex / 3;
//            System.out.println(sex);
//        } while (sex >= gays);


        String yawaaNimoUy = "3 7 4 -1 2";
        Scanner tanginamo = new Scanner(yawaaNimoUy);
        int bolbol = 0;
        int wewe;
        int hi = 1;
        while (hi <= 5) {
            wewe = tanginamo.nextInt();
            if (wewe < 0) {
                bolbol = bolbol + wewe;
            }
            hi++;
        }
        System.out.println(bolbol + "Hayop ");
        int numx = 10;
        boolean found = false;
        do {
            System.out.print(numx + " ");
            if (numx <= 2) {
                found = true;
            } else {
                numx = numx - 3;
            }
        } while (numx > 0 && !found);
        int[] numbers;
        String[] fruits;
        String[] shit = new String[51];

    }

}