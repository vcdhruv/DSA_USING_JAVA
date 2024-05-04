package Pattern;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern : ");
        int size = sc.nextInt();
        int rows = size;
        int sp = 2 * size - 3 , st = 1;
        for (int i = 1; i <= rows; i++) {
            int val = 1;
            // System.out.println(st+","+sp+","+st);
            for (int j = 1; j <= st; j++) {
                System.out.print(val);
                val++;
                
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            if (i == rows) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val);
            }
            st++;;
            sp-=2;
            System.out.println();
        }
    }
}
