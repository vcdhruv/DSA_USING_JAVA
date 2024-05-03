package Assignments;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number to print fibonnaci series : ");
        // int n = sc.nextInt() , a = 1 , b = 1;
        // System.out.print(a + " " + b + " ");
        // for (int i = 1; i <= n - 2; i++) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        //     System.out.print(b + " ");
        // }
        // System.out.println();

        // int sum = 0;
        // while (true) {
        //     System.out.print("Enter number : ");
        //     int num = sc.nextInt();
        //     if (num == 99) {
        //         break;
        //     }else if(num > 0){
        //         sum = sum + num;
        //     }else{
        //         sum = -1;
        //         break;
        //     }
        // }
        // System.out.println("Sum : "+sum);

        // System.out.print("Enter a number you want to find factorial of : ");
        // int x = sc.nextInt() , fact = 1;
        // for (int i = 1; i <= x; i++) {
        //     fact = fact * i;
        // }
        // System.out.println("factorial : "+fact);

        // System.out.print("Enter a number till you want armstrong number : ");
        // int an = sc.nextInt();
        // System.out.print("Armstrong numbers : 0 ");
        // for (int i = 1; i < an; i++) {
        //     int number = i;
        //     int count = 0;
        //     while (number > 0) {
        //         count++;
        //         number /= 10;
        //     }
        //     int original_number = i;
        //     boolean flag = false;
        //     int p = 0;
        //     while (original_number > 0) {
        //        int unit_digit = original_number % 10; 
        //        p = (int) (p + Math.pow(unit_digit, count));
        //        original_number = original_number / 10; 
        //     }
        //     if (p == i) {
        //         flag = true;
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println();

        // System.out.print("Enter Number Of Rows : ");
        // int rows2 = sc.nextInt();
        // System.out.println("X Shape Pattern : ");

        // for (int i = 1; i <= rows2; i++) {
        //     for (int j = 1; j <= rows2; j++) {
        //         if (i == j || (i+j == rows2 + 1)) {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // System.out.println("Enter size of pyramid");
        // int rows = sc.nextInt();
        // outer:for (int i = 1; i <= rows; i++) {
        //     spaces:for (int j = 1; j <= rows - i; j++) {
        //         System.out.print(" ");
        //     }
        //     letters:for (int j = 65 , k = 1; k <= 2 * i - 1; j++ , k++) {
        //         System.out.print((char)j);
        //     }
        //     System.out.println();
        // }
        // outer:for (int i = rows - 1; i >= 1; i--) {
        //     spaces:for (int j = rows - i; j >= 1; j--) {
        //         System.out.print(" ");
        //     }
        //     letters:for (int j = 65 , k = 2 * i - 1 ; k >= 1 ; j++ , k--) {
        //         System.out.print((char)j);
        //     }
        //     System.out.println();
        // }

        // System.out.println();

        System.out.print("Enter size of plus sign : ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(i == size / 2 + 1 || j == size / 2 + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
