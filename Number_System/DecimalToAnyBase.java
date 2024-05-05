package Number_System;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        int pw = 1 , answer = 0;
        while (decimal != 0) {
            answer += (decimal % base) * pw;
            pw*=10;
            decimal /= base;
        }
        System.out.println("Answer Of Base "+base+" is : "+answer);
    }
}
