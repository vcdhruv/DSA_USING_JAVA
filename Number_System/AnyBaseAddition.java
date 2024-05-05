package Number_System;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        int answer = 0 , carry = 0 , pw = 1;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int unit_digit_n1 = n1 % 10;
            int unit_digit_n2 = n2 % 10;
            int sum = carry + unit_digit_n1 + unit_digit_n2;
            answer = answer + ( sum % base ) * pw;
            carry = sum / base;
            pw = pw * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        System.out.print("Sum is : "+answer);
    }
}
