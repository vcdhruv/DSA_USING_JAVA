package Arrays;

import java.util.Scanner;

public class Inverse {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] inverse(int[] arr){
        int[] inverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inverse[arr[i]] = i;
        }
        return inverse;
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
        int[] inverse = inverse(arr);
        printArray(inverse);
    }
}
