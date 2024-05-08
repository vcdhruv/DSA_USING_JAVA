package Arrays;

import java.util.Scanner;

public class SuffixSumInPlace {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void generateSuffixSumInPlace(int[] arr){
        for (int i = arr.length - 2; i >= 0 ; i--) {
            arr[i] = arr[i+1] + arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        generateSuffixSumInPlace(arr);
        printArray(arr);
    }
}
