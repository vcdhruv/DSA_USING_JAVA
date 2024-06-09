package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1000, 500, 10000, 250, 5000 };
        for (int i = 1; i <= arr.length-1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}