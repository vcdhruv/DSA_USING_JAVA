package Pattern;

import java.util.Scanner;

public class NumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        outer:for (int i = 1; i <= rows; i++) {
            spaces:for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            numbers:for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            numbers:for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
