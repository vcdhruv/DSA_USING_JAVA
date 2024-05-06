package Arrays;

import java.util.Scanner;

public class CountElement {
    public static int OccurrenceOfElement(int[] arr, int n){
        int count = 0;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }
        return count;
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
        System.out.print("Which element we should count ? : ");
        int findElement = sc.nextInt();
        System.out.println("Occurrence Of "+findElement+" is : "+OccurrenceOfElement(arr, findElement));
    }
}
