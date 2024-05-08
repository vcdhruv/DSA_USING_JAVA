package Arrays;

import java.util.Scanner;

public class SubArrayEqualSum {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] generatePrefixSum(int[] arr){
        int[] pref = new int[arr.length];
        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = 0; j < i; j++) {
                sum = sum + arr[j];
            }
            pref[i] = sum;
        }
        return pref;
    }
    public static int[] generateSuffixSum(int[] arr){
        int[] suff = new int[arr.length];
        int sum;
        for (int i = arr.length-1; i >= 0; i--) {
            sum = arr[i];
            for (int j = arr.length-1; j > i; j--) {
                sum = sum + arr[j];
            }
            suff[i] = sum;
        }
        return suff;
    }
    public static boolean IsSubArray(int[] arr){
        int[] prefixSum = generatePrefixSum(arr);
        int[] suffixSum = generateSuffixSum(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (prefixSum[i] == suffixSum[i+1]) {
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
        int[] prefix = generatePrefixSum(arr);
        int[] suffix = generateSuffixSum(arr);
        System.out.print("Prefix sum : ");
        printArray(prefix);
        System.out.print("Suffix sum : ");
        printArray(suffix);
        System.out.println(IsSubArray(arr));
    }
}
