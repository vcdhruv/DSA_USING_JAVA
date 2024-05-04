package Pattern;

import java.util.Scanner;

public class Swastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of swastik : ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (( i == 1 && j <= size / 2 + 1 ) || ( i == 1 && j == size ) || i == size / 2 + 1 || j == size / 2 + 1 || ( j == 1 && i >= size/2 + 1) || ( i == size && j >= size/2+1 ) ) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
