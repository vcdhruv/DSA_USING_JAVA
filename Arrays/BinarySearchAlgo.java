package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgo {
    public static boolean binarySearch(int[] arr,int findNumber){
        int low = 0 , high = arr.length - 1;
        while (low <= high) {
            int mid = ( low + high ) / 2;
            if (arr[mid] == findNumber) {
                return true;
            }else if(arr[mid] < findNumber){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return false;
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
        Arrays.sort(arr);
        System.out.print("Which number you want to find ? : ");
        int findNumber = sc.nextInt();
        boolean found = binarySearch(arr, findNumber);
        System.out.println("Number found : "+found);
    }
}
