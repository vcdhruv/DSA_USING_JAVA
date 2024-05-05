package Number_System;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.print("Tell base of number entered : ");
        int base = sc.nextInt();
        int pw = 1 , answer = 0;
        while (number != 0) {
            answer = answer + (number % 10) * pw;
            pw *= base;
            number /= 10;
        }
        System.out.println("Decimal Of Base "+base+" is : "+answer);

    }
}
