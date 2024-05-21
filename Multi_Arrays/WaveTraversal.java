package Multi_Arrays;

import java.util.Scanner;

public class WaveTraversal {
    
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
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        int[][] matrix = createMultiArray(r, c);
        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }else{
                for (int i = matrix.length-1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        
    }
}
