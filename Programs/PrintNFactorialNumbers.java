package Programs;

import java.util.Scanner;

public class PrintNFactorialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to print factorial of : ");
        int n = sc.nextInt() , fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.print(fact + " ");
        }
    }
}
