package Multi_Arrays;

import java.util.Scanner;

public class PerfectMatrix {
    public static boolean checkPerfectMatrix(int[][] matrix){
        boolean perfect = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( (i == j || i+j == matrix[i].length-1) && matrix[i][j] == 0) {
                    perfect = false;
                    return perfect;
                }
            }
        }
        return perfect;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter "+n*m+" elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Prefect Matrix : "+checkPerfectMatrix(matrix));
    } 
}
