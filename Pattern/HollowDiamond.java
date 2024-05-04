package Pattern;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of hollow diamond : ");
        int size = sc.nextInt();
        int sp = 1 , st = size/2 + 1;
        outer:for (int i = 1; i <= size; i++) {
            // System.out.println(st + "," + sp + "," + st);
            star:for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            space:for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            star:for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if (i <= size/2) {
                st--;
                sp+=2;   
            }else{
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
