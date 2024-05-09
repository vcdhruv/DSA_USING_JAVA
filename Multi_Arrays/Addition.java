package Multi_Arrays;

import java.util.Scanner;

public class Addition {
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
    public static int[][] addMatrices(int[][] arr_1 ,int r1 ,int c1 ,int[][] arr_2 ,int r2 ,int c2){
        int[][] answer = new int[r1][c1];
        if (r1 != r2 || c1 != c2) {
            return answer;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                answer[i][j] = arr_1[i][j] + arr_2[i][j];
            }
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
        int[][] addition = addMatrices(arr_1,r1,c1,arr_2,r2,c2);
        printArray(addition);
    }
}
