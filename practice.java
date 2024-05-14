import java.util.Scanner;

public class practice {
    
    public static void main(String[] args){
        int n1 = 2 , m1 = 3;
        int[][] nums1 = {{2,4,1},{3,5,6}};
        int n2 = 3 , m2 = 2;
        int[][] nums2 = {{1,2},{3,4},{5,7}};
        if (m1 != n2) {
            System.out.println("Invalid Input");
        }else{
            int[][] ans = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int j2 = 0; j2 < m1; j2++) {
                        ans[i][j] += nums1[i][j2]*nums2[j2][j];
                    }
                }
            }
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
