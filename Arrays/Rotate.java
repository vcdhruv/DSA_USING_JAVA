package Arrays;

import java.util.Scanner;

public class Rotate {

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseToRotate(int[] arr , int start , int end){
        int s = start , e = end;
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }
    }

    

    public static void rotate(int[] arr , int k){
        reverseToRotate(arr,0,arr.length-k-1);
        reverseToRotate(arr, arr.length-k, arr.length - 1);
        reverseToRotate(arr, 0, arr.length-1);
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
        System.out.print("How many times you want to rotate : ");
        int k = sc.nextInt();
        if (k < 0) {
            k = k + arr.length;
        }
        k = k % arr.length;
        printArray(arr);
        rotate(arr, k);
        printArray(arr);
    }
}
