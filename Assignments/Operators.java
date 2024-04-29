package Assignments;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number x:");
        int x = sc.nextInt();
        System.out.println("result : " +  (((8 + x) / 3) % 5) * 5 );

        System.out.println("Enter numbers you want to swap....");
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println("Number After Swapping...");
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("First Number : "+n1);
        System.out.println("Second Number : "+n2);

        System.out.print("Enter a number you want to find sum of digits : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;
        }
        System.out.println("sum of digits : "+sum);

        int a = 55 , b = 70;
        System.out.println("a < 50 " + (a < 50) + " a < b " + (a < b) + " a < 50 and a < b "+(a < 50 && a < b));
        System.out.println("a < 50 " + (a < 50) + " a < b " + (a < b) + " a < 50 or a < b "+(a < 50 || a < b));

        System.out.println("Enter first number in which bits needed to be flipped to convert to next number : ");
        int x1 = sc.nextInt();
        System.out.println("Enter a number you want to convert to : ");
        int x2 = sc.nextInt();
        int XOR_result = x1 ^ x2;
        int count = 0;
        while (XOR_result != 0) {
            XOR_result = XOR_result & ( XOR_result - 1 );
            count++;
        }
        System.out.println("count : "+count);
    }
}
