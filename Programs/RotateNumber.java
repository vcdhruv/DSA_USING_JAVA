package Programs;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to rotate : ");
        int n = sc.nextInt();
        System.out.print("How many number you want to rotate : ");
        int k = sc.nextInt();
        int numOfDigits = 0;
        int original_number = n;
        while (n != 0) {
            n = n / 10;
            numOfDigits++;
        }
        if (k < 1) {
            k = k + numOfDigits;
        }
        n = original_number;
        k = k % numOfDigits;
        System.out.println("k:"+k);
        int digits = n % (int)Math.pow(10, k);
        System.out.println("digits:"+digits);
        int remaining_digits = n / (int)Math.pow(10, k);
        System.out.println("remaining digits:"+remaining_digits);
        int answer = (digits * (int)Math.pow(10, numOfDigits - k)) + remaining_digits;
        System.out.println("On Rotating " + original_number + " by " + k + " it gives : " + answer);
    }
}
