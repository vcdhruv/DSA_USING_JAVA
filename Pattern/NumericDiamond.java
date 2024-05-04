package Pattern;

import java.util.Scanner;

public class NumericDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of diamond : ");
        int size = sc.nextInt();
        int sp = size / 2 , st = 1, val=1;
        for (int i = 1; i <= size; i++) {
            // System.out.println(sp + "," + st);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" \t");
            }
            int pVal = val;
            for (int j = 1; j <= st; j++) {
                System.out.print(pVal+"\t");
                if (j <= st / 2) {
                    pVal++;                    
                }else{
                    pVal--;
                }
            }
            if (i <= size / 2) {
                sp--;
                st+=2;
                val++;
            }else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }
    }
}
