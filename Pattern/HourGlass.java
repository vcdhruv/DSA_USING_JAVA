package Pattern;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of hour glass : ");
        int size = sc.nextInt();
        int sp = 0 , st = size;
        for (int i = 1; i <= size; i++) {
            // System.out.print(sp+","+st);
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i < size / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            if(i <= size / 2){
                sp++;
                st-=2;
            }else{
                sp--;
                st+=2;
            }

            System.out.println();
        }
    }
}
