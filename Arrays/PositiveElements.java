package Arrays;

import java.util.Scanner;

public class PositiveElements {

    public static void SearchPositive(int[] arr){
        for (int i : arr) {
            if (i >= 0) {
                System.out.println(i);
            }
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
        SearchPositive(arr);   
    }
}
