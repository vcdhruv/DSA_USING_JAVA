package Multi_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4 }, { 2, 3 }, { 5, 8 }, { 6, 9 } };
        Arrays.sort(matrix, (a, b) -> a[0] - b[0]); // to sort array based on index 0
        int i = 0;
        int overlappingCount = 0, nonOverlappingCount = 0;
        ArrayList overlapList = new ArrayList<>();
        while (i < matrix.length) {
            while (i < matrix.length - 1 && matrix[i + 1][0] <= matrix[i][1]) { // because last element is always non
                                                                                // overlapping
                matrix[i + 1][0] = matrix[i][0]; // since array is sorted
                matrix[i + 1][1] = Math.max(matrix[i + 1][1], matrix[i][1]);
                int[] ans = new int[2];
                ans[0] = matrix[i + 1][0];
                ans[1] = matrix[i + 1][1];
                overlapList.add(ans);
                i++;
                overlappingCount++;
            }
            i++;
            nonOverlappingCount++;
        }
        System.out.println("Overlapping Count : " + overlappingCount);
        System.out.println("Non Overlapping Count : " + nonOverlappingCount);
        System.out.println("Overlapping list : ");
        for (int j = 0; j < overlapList.size(); j++) {
            int[] interval = (int[]) overlapList.get(j);
            System.out.println(Arrays.toString(interval));
        }

    }
}
