package Multi_Arrays;

import java.util.Scanner;

public class ExitPoint {
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
        int direction = 0 , i = 0 , j = 0;
        while (true) {
            direction = ( direction + matrix[i][j] ) % 4;
            if (direction == 0) {
                j++;
            }else if(direction == 1){
                i++;
            }else if(direction == 2){
                j--;
            }else if(direction == 3){
                i--;
            }

            if(i < 0){
                i++;
                System.out.println(i+","+j);
                break;
            } else if (j < 0) {
                j++;
                System.out.println(i+","+j);
                break;
            } else if (i == matrix.length) {
                i--;
                System.out.println(i+","+j);
                break;
            } else if (j == matrix[0].length) {
                j--;
                System.out.println(i+","+j);
                break;
            }
        }
    }

    
}
