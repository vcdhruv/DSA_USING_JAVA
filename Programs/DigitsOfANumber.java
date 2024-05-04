package Programs;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_number = n;
        while (n != 0) {
            n = n/10;
            numOfDigits++;
        }
        while (original_number != 0) {
            System.out.println(original_number / (int)Math.pow(10, numOfDigits - 1)); // print qoutient
            original_number %= (int)Math.pow(10, numOfDigits - 1); // remainder
            numOfDigits--;
        }
    }
}
