package Arrays;

import java.util.Scanner;

public class Reverse {

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr){
        int start = 0 , end = arr.length - 1;
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
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
        reverse(arr);
        printArray(arr);
    }
}
