package Pattern;

import java.util.Scanner;

public class RightALignReverseTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        int stars = rows;
        outer:for (int i = 1; i <= rows; i++) {
            spaces:for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            stars:for (int j = stars; j >= 1; j--) {
                System.out.print("* ");
            }
            stars--;
            System.out.println();
        }
    }
}
