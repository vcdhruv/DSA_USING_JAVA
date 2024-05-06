package Arrays;

import java.util.Scanner;

public class KthSmallestAndLargestElement {
    public static int[] KthSmallestAndLargestElement(int[] arr,int k){
        for (int i = 1; i < k; i++) {
            int small = SmallestAndLargestElement(arr)[0];
            int large = SmallestAndLargestElement(arr)[1];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == small){
                    arr[j] = Integer.MAX_VALUE;
                }
                if(arr[j] == large){
                    arr[j] = Integer.MIN_VALUE;
                }   
            }
        }
        return new int[]{SmallestAndLargestElement(arr)[0],SmallestAndLargestElement(arr)[1]};
    }
    public static int[] SmallestAndLargestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < min && i != Integer.MIN_VALUE ) {
                min = i;
            }
            if (i > max && i != Integer.MAX_VALUE) {
                max = i;
            }
        }
        return new int[]{min,max};
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
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        k = k % arr.length;
        int[] answer = KthSmallestAndLargestElement(arr, k);
        System.out.println("Smallest : "+answer[0]);
        System.out.println("Largest : "+answer[1]);
    }
}
