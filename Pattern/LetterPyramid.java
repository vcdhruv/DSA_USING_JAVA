package Pattern;

import java.util.Scanner;

public class LetterPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows : ");
        //size should be only 5 it should not be according to rows it should be according to size means if size 5 then below pyramid.
        int rows = sc.nextInt();
        outer:for (int i = 1; i <= rows; i++) {
            spaces:for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            letters:for (int j = 65 , k = 1; k <= 2 * i - 1; j++ , k++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
        outer:for (int i = rows - 1; i >= 1; i--) {
            spaces:for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            letters:for (int j = 65 , k = 2 * i - 1 ; k >= 1 ; j++ , k--) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
