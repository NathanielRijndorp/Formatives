package Lab_1;

public class test {

    public static void main(String[] args) {
    int num1=15,num2=-15,num3=10;
    System.out.println((num1>=num2)+"\t&&\t"+(num1<=num3)+"\t= "+((num1>=0) && (num1<=num3)));
    System.out.println((num1!=num2)+"\t&&\t"+(num3>=num1)+"\t= "+((num1!=num2) && (num3>=num1)));
    System.out.println((num2<=num3)+"\t||\t"+(num3>=num2)+"\t= "+((num2<=num3) && (num3>=num2)));
    System.out.println((num1<=num3)+"\t||\t"+(num1>=num2)+"\t= "+((num1<=num3) && (num1>=num2)));
    System.out.println(((!(num2<=num3)+"\t||\t"+(num1>=num2)+"\t= "+(!(num2<=num3) && (num1>=num2)))));
    System.out.println(!((num1!=num3) && (num1>num2)));
    int num4=10 , num5=18;
    if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
        System.out.println(num1);
    }else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
        System.out.println(num2);
    }else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
        System.out.println(num3);
    }else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
        System.out.println(num4);
    }else if (num5>num1 && num5>num2 && num5>num3 && num5>num4) {
        System.out.println(num5);
    }

    System.out.println(num1/2);
    System.out.println(num4/2);

    int fifty = 500;
    byte fiddy = (byte) fifty;
    System.out.println("you get " + fiddy);
    // 390.625
    }
}
