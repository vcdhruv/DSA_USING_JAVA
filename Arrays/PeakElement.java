package Arrays;

import java.util.Scanner;

public class PeakElement {
    public static String SearchPeak(int[] arr){
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return arr[i]+"";
            }
        }
        return "Not Found";
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
        System.out.println(SearchPeak(arr));
    }
}
