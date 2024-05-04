package Pattern;

import java.util.Scanner;

public class NumericTraingular02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        int x = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x+"\t");
                x++;
            }
            System.out.println();
        }
    }
}
