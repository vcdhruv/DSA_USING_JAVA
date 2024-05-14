package Multi_Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            int[] temp = new int[i+1];
            int icj = 1;
            for (int j = 0; j < i+1; j++) {
                temp[j] = icj;
                int icjp1 = (icj*(i-j))/(j+1);
                icj = icjp1;
            }
            pascal[i] = temp;
        }
        printArray(pascal);
    }
}
