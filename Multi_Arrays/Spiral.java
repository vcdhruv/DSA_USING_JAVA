package Multi_Arrays;

import java.util.Scanner;

public class Spiral {
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] createMultiArray(int r , int c){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 1 : ");
        int c1 = sc.nextInt();
        System.out.println("Enter "+r1*c1+" elements : ");
        int[][] arr_1 = createMultiArray(r1,c1);
        int topRow = 0 ,bottomRow = r1 - 1 ,leftCol = 0 , rightCol = c1 - 1 ,count = 0;
        while (count < r1*c1) {
            for (int i = leftCol; i <= rightCol && count < r1*c1; i++) {
                System.out.print(arr_1[topRow][i] + " ");
                count++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && count < r1*c1; i++) {
                System.out.print(arr_1[i][rightCol] + " ");
                count++;
            }
            rightCol--;
            for (int i = rightCol; i >= leftCol && count < r1*c1; i--) {
                System.out.print(arr_1[bottomRow][i] + " ");
                count++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && count < r1*c1; i--) {
                System.out.print(arr_1[i][leftCol] + " ");
                count++;
            }
            leftCol++;
        }
    }
}
