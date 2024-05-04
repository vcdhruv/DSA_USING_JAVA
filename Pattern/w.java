package Pattern;

import java.util.Scanner;

public class w {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of w : ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || ( i + j == size + 1 && i >= j) || ( i==j && i>=size/2+1 && j>=size/2+1 )) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
