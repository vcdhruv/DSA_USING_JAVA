package Multi_Arrays;

import java.util.Scanner;

public class Multiplication {
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
    public static int[][] multiplayMatrices(int[][] arr_1 ,int r1 ,int c1 ,int[][] arr_2 ,int r2 ,int c2 ){
        int[][] answer = new int[r1][c2];
        if (c1 != r2) {
            System.out.println("Wrong input---");
            return answer;
        }
        row_of_matrix_1:for (int i = 0; i < r1; i++) {
            column_of_matrix_2:for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    answer[i][j] += arr_1[i][k] * arr_2[k][j];
                    // System.out.print(arr_1[i][k] + "x" + arr_2[k][j]+" ");
                }
            }
            System.out.println();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 1 : ");
        int c1 = sc.nextInt();
        System.out.println("Enter "+r1*c1+" elements : ");
        int[][] arr_1 = createMultiArray(r1,c1);
        
        System.out.print("Enter number of rows of matrix 2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 2 : ");
        int c2 = sc.nextInt();
        System.out.println("Enter "+r2*c2+" elements : ");
        int[][] arr_2 = createMultiArray(r2,c2);
        printArray(arr_1);
        printArray(arr_2);
        int[][] answer = multiplayMatrices(arr_1, r1, c1, arr_2, r2, c2);
        printArray(answer);
    }
}
