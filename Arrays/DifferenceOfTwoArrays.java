package Arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void printArray(int[] arr, int startingIndex){
        for (int i = startingIndex; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1 : ");
        int size_1 = sc.nextInt();
        int[] arr_1 = new int[size_1];
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print("Enter size " + (i+1) + " : ");
            arr_1[i] = sc.nextInt();
        }
        System.out.print("Enter size of array 2 : ");
        int size_2;
        while (true) {
            size_2 = sc.nextInt();
            if (size_2 < size_1){
                System.out.print("Size should not be less then "+size_1+" : ");
                continue;
            }else{
                break;
            }
        }
        int[] arr_2 = new int[size_2];
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print("Enter size " + (i+1) + " : ");
            arr_2[i] = sc.nextInt();
        }
        int[] difference = new int[size_2];
        int i = arr_1.length - 1;
        int j = arr_2.length - 1;
        int k = difference.length - 1;
        int borrow = 0;
        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? arr_1[i] : 0;
            if(arr_2[j]+borrow >= a1v){
                d = arr_2[j] + borrow - a1v;
                borrow = 0;
            }else{
                d = arr_2[j] + borrow + 10 - a1v;
                borrow = -1;
            }
            difference[k] = d;
            i--;
            j--;
            k--;  
        }
        int idx = 0;
        while (idx < difference.length) {
            if (difference[idx] != 0) {
                break;
            }else{
                idx++;
            }
        }
        printArray(difference,idx);
    }
}
