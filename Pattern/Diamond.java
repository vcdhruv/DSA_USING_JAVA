package Pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of diamond : ");
        int size = sc.nextInt();
        int sp = size / 2, st = 1;
        for (int i = 1; i <= size; i++) {
            // System.out.println(sp + "," + st);
            spaces:for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            stars:for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if (i <= size / 2) {
                sp--;
                st += 2;
            }else{
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
}
