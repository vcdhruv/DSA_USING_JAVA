package Arrays;

import java.util.Scanner;

public class SubArrayEqualSumUsingPrefixSum {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void generatePrefixSumInPlace(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
    }
    public static boolean IsSubArrayEqualSum(int[] arr){
        generatePrefixSumInPlace(arr);
        for (int i = 0; i < arr.length; i++) {
            int suffixSum = arr[arr.length - 1] - arr[i];
            if (arr[i] == suffixSum) {
                return true;
            }
        }
        return false;
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
        System.out.println("Is Sub Array Possible : "+IsSubArrayEqualSum(arr));
    }
}
