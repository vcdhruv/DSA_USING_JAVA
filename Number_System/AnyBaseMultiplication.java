package Number_System;

import java.util.Scanner;

public class AnyBaseMultiplication {

    public static int AnyBaseAddition(int n1 , int n2 , int base){
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
        return answer;
    }

    public static int getProductWithSingleDigit(int n1 , int lastDigitOfNumberTwo , int base){
        int answer = 0 , c = 0 , pw = 1;
        while (n1 != 0 || c != 0) {
            int b1 = n1 % 10;
            answer = answer + (((b1 * lastDigitOfNumberTwo)+c)%base)*pw;
            c = ((b1*lastDigitOfNumberTwo)+c)/base;
            pw = pw * 10;
            n1 = n1 / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        int alignAddition = 1 , answer = 0;
        while (n2 != 0) {
            int b2 = n2 % 10;
            int sprd = getProductWithSingleDigit(n1, b2, base);
            System.out.println("sprd for "+b2+" is : "+sprd);
            n2 = n2 / 10;
            answer = AnyBaseAddition(answer, sprd*alignAddition, base);
            alignAddition = alignAddition * 10;
        }
        System.out.println("Answer is : "+answer);
    }
}
