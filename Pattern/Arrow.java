package Pattern;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrow : ");
        int size = sc.nextInt();
        int st = 1 , sp = size / 2;
        for (int i = 1; i <= size; i++) {
            // System.out.println(sp+","+st);
            for (int j = 1; j <= sp; j++) {
                if (i == size / 2 + 1) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= size / 2) {
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
    }
}
