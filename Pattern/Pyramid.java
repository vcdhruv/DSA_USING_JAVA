package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        outer:for (int i = 1; i <= rows; i++) {
            spaces:for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            stars:for (int j = 1; j <= ( i * 2 - 1 ); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
