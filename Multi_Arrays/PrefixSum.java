package Multi_Arrays;

import java.util.Scanner;

public class PrefixSum {
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
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = matrix[i][j];
                if (i == 0 && j == 0) {
                    continue;
                }else if(i == 0){
                    arr[i][j] += arr[i][j-1];
                }else if(j == 0){
                    arr[i][j] += arr[i-1][j];
                }else{
                    arr[i][j] += arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
