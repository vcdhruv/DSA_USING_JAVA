package Pattern;

import java.util.Scanner;

public class ReverseTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        outer:for (int i = 0; i < rows; i++) {
            inner:for (int j = 0; j < rows-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
