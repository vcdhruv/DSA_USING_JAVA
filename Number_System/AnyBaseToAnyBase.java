package Number_System;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static int AnyBaseToDecimal(int n, int base) {
        int pw = 1, answer = 0;
        while (n > 0) {
            answer += (n % 10) * pw;
            pw *= base;
            n /= 10;
        }
        return answer;
    }

    public static int DecimalToAnyBase(int n, int base) {
        int pw = 1, answer = 0;
        while (n > 0) {
            answer += (n % base) * pw;
            pw *= 10;
            n /= base;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.print("Tell base of number entered : ");
        int base = sc.nextInt();
        System.out.print("Tell base to be converted to : ");
        int cbase = sc.nextInt();
        int original_n = number;
        int dec = AnyBaseToDecimal(number, base);
        System.out.println(dec);
        int answer = DecimalToAnyBase(dec, cbase);
        System.out.println("Answer Of " + original_n + " of base " + base + " to base " + cbase + " is : " + answer);
    }
}
