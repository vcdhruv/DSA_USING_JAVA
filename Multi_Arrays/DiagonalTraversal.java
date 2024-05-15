package Multi_Arrays;

public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        int m = matrix[0].length;
        int[] answer = new int[n*m];
        int row = 0 , col = 0 , idx = 0;
        boolean up = true;
        while (row < n && col < m) {
            if (up) {
                while (row > 0 && col < m-1) {
                    answer[idx++] = matrix[row][col];
                    row--;
                    col++;
                }
                answer[idx++] = matrix[row][col];
                if (col == m-1) {
                    row++;
                }else{
                    col++;
                }
            }else{
                while (col > 0 && row < n-1) {
                    answer[idx++] = matrix[row][col];
                    row++;
                    col--;
                }
                answer[idx++] = matrix[row][col];
                if (row == n-1) {
                    col++;
                }else{
                    row++;
                }
            }
            up = !up;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
