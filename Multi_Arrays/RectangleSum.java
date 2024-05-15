package Multi_Arrays;

import java.util.Scanner;

public class RectangleSum {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] createMultiArray(int r, int c) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int rectangleSum1(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static void prefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }
    public static void generatePrefixMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            prefixSum(matrix[i]);
        }
    }
    public static void generatePrefixSumOverColumns(int[][] matrix){
        generatePrefixMatrix(matrix);
        // printArray(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                matrix[j][i] += matrix[j-1][i];
            }
        }
    }
    public static int rectangleSum2(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum = 0;
        generatePrefixMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            if(r1 >= 1)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2];
        }
        return sum;
    }
    public static int rectangleSum3(int[][] matrix,int l1,int r1,int l2,int r2){
        int ans = 0 , sum = 0 , up = 0 , left = 0 , upleft = 0;
        generatePrefixSumOverColumns(matrix);
        printArray(matrix);
        sum = matrix[l2][r2];
        if(l1 >= 1)
            up = matrix[l1-1][r2]; 
        if(r1 >= 1)
            left = matrix[l2][r1-1]; 
        if(l1 >= 1 && r1 >= 1)
            upleft = matrix[l1-1][r1-1];
        ans = sum - left - up + upleft;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix 1 : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns of matrix 1 : ");
        int c = sc.nextInt();
        System.out.println("Enter " + r * c + " elements : ");
        int[][] arr_1 = createMultiArray(r, c);
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt() , r1 = sc.nextInt() , l2 = sc.nextInt() , r2 = sc.nextInt();
        // generatePrefixSumOverColumns(arr_1);
        // generatePrefixMatrix(arr_1);
        // printArray(arr_1);
        System.out.println("Sum Of rectangle from ("+l1+","+r1+")"+" to "+"("+l2+","+r2+") is : "+rectangleSum1(arr_1, l1, r1, l2, r2));
        System.out.println("Sum Of rectangle from ("+l1+","+r1+")"+" to "+"("+l2+","+r2+") is : "+rectangleSum2(arr_1, l1, r1, l2, r2));
        System.out.println("If both rectangleSum2 and rectangleum3 are called at a time then answer will not be same since rectangleSum2 will create prefix sum and it will change in placce so...");
        System.out.println("Sum Of rectangle from ("+l1+","+r1+")"+" to "+"("+l2+","+r2+") is : "+rectangleSum3(arr_1, l1, r1, l2, r2));


    }
}
