package Arrays;

import java.util.Scanner;

public class SmallestAndLargestElement {

    public static int[] SmallestAndLargestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
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
        int[] answer = SmallestAndLargestElement(arr);
        System.out.println("Smallest : "+answer[0]);
        System.out.println("Largest : "+answer[1]);
    }
}
