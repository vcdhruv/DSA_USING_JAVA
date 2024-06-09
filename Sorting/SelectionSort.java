package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1000, 500, 10000, 250, 5000 };
        int j,min;
        for (int i = 0; i < arr.length; i++) {
            j = i + 1;
            min = i;
            while (j < arr.length) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
                j++;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
