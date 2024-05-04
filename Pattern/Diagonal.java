package Pattern;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of diagonal : ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++){
                if (j == i) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
