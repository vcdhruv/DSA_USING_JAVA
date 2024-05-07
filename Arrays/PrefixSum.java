package Arrays;

import java.util.Scanner;

public class PrefixSum {
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
        int[] ans = generatePrefixSum(arr);
        printArray(ans);
    }
}
