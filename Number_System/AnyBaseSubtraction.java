package Number_System;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        int borrow = 0 , answer = 0 , pw = 1;
        while (n1 != 0 || n2 != 0 || borrow != 0) {
            int unit_digit_n1 = n1 % 10;
            int unit_digit_n2 = n2 % 10;
            int subtract = unit_digit_n2 - unit_digit_n1 + borrow;
            if (subtract < 0) {
                borrow = -1;
                answer = answer + (subtract + base)*pw;
            }else{
                borrow = 0;
                answer = answer + subtract*pw;
            }
            pw*=10;
            n1 = n1/10;
            n2 = n2/10;
            // System.out.println(answer);
        }
        System.out.println("subtract from n2 - n1 is : "+answer);
    }
}
