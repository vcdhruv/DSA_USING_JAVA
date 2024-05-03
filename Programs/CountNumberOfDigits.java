package Programs;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt(), count = 0 , original_number = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits in " + original_number + ": "+count);
    }
}
