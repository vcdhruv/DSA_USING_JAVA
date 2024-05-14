package Multi_Arrays;

import java.util.Scanner;

public class RotateBy90Dagree {
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
    public static void createTransposeMatrix(int[][] matrix ,int r ,int c){
        if(r != c){
            int[][] answer = new int[c][r];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    answer[i][j] = matrix[j][i];
                }
            }
            printArray(answer);
        }else{
            for (int i = 0; i < c; i++) {
                for (int j = i; j < r; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            printArray(matrix);
        }
    }
    public static void reverse(int[] arr){
        int i = 0 , j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void reverseEachRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int[] innerArray = arr[i];
            reverse(innerArray);
        }
    }
    public static void rotateBy90Degree(int[][] matrix ,int r ,int c){
        createTransposeMatrix(matrix, r, c);
        reverseEachRow(matrix);
    }

    public static void swapRows(int[][] arr ,int start ,int end){
        int[] temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void rotateBy90DegreeAntiClockWise(int[][] matrix ,int r ,int c){
        createTransposeMatrix(matrix, r, c);
        int j = c - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i <= j) {
                swapRows(matrix, i, j);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 1 : ");
        int c1 = sc.nextInt();
        System.out.println("Enter "+r1*c1+" elements : ");
        int[][] arr_1 = createMultiArray(r1,c1);
        // rotateBy90Degree(arr_1, r1, c1);
        printArray(arr_1);
        rotateBy90DegreeAntiClockWise(arr_1, r1, c1);
        printArray(arr_1);
    }
}
