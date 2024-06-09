package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,9,1,3};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                int j = i;
                while (j > 0) {
                    if (arr[j] < arr[j-1]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                    j--;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }  
}
