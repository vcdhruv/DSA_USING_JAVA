package Arrays;

import java.util.Scanner;

public class FindAbsoluteDifferenceFromSortedArray {

    public static String findAbsoluteDifference(int[] array , int sum){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if ((int)Math.abs(array[j]-array[i]) == sum ) {
                    return "yes";
                }
            }
        }
        return "no";
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
        System.out.print("Enter Absolute Difference Value : ");
        int absolute_diff_val = sc.nextInt();
        System.out.println("Is there any absolute difference : "+findAbsoluteDifference(arr, absolute_diff_val));
    }
}
