package Arrays;

import java.util.Scanner;

public class ConditionalSorted {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
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

        int[] arr_2 = new int[arr.length];
        int index = 0;
        
        for (int i : arr) {
            if (i >=0) {
                arr_2[index] = i;
                index++;
            }
        }

        for (int i : arr) {
            if (i < 0) {
                arr_2[index] = i;
                index++;
            }
        }
        
        printArray(arr_2);
    }
}
