package Pattern;

import java.util.Scanner;

public class NumericPyramidBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        outer: for (int i = 1; i <= rows; i++) {
            spaces: for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            numbers: for (int k = 1; k <= (2 * i - 1); k++) {
                if (i == rows || k == 2 * i - 1 || k == 1 ) {
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
