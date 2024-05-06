package Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] arr , int n){
        for (int i = 1; i <= n; i++) {
            int number = i;
            boolean present = false;;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == number) {
                    present = true;
                    break;
                }
            }
            if (present == false) {
                return number;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size-1];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Number : "+missingNumber(arr, size));
    }
}
