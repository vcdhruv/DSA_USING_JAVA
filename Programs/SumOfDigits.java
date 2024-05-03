package Programs;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt() , temp = n , sum = 0;
        while (temp > 0) {
            sum = sum + temp%10;
            temp = temp / 10;
        }
        System.out.print("Sum of digits in " + n + " is : "+sum);
    }
}
