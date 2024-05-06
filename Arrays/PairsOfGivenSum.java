package Arrays;

import java.util.Scanner;

public class PairsOfGivenSum {
    public static int Pairs(int[] arr, int sum){
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i]+","+arr[j]);
                    pairs++;
                }
            }
        }
        return pairs;
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
        System.out.print("What is the sum value to be added : ");
        int sum = sc.nextInt();
        System.out.println("Pairs of number : " + Pairs(arr, sum));
    }
}
