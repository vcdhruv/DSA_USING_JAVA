package Pattern;

import java.util.Scanner;

public class NumericalRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        outer:for (int i = 1; i <= n; i++) {
            numbers:for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            repeat:for (int j = 1; j <= ( i - 1 ); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
