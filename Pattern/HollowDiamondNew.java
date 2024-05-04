package Pattern;

import java.util.Scanner;

public class HollowDiamondNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of hollow diamond : ");
        int size = sc.nextInt();
        int outerSp = size / 2 , st = 1 , innerSp = -1;
        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size) {
                st = 1;
            }else{
                st = 2;
            }
            // System.out.println(outerSp + "," + st + "," + innerSp);
            spaces:for (int j = 1; j <= outerSp; j++) {
                System.out.print("  ");
            }
            stars:for (int j = 1; j <= st; j++) {
                System.out.print("* ");
                spaces:for (int k = 1; k <= innerSp; k++) {
                    System.out.print("  ");
                }
            }
            
            if(i <= size / 2){
                outerSp--;
                innerSp+=2;
            }
            else{
                outerSp++;
                innerSp-=2;
            }
            System.out.println();
        }
    }
}
