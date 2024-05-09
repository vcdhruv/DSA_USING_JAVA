package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CeilFloor {
    public static void findCeilFloor(int[] arr , int n){
        int i = 0 , j = arr.length - 1;
        int ceil = 0 , floor = 0;
        while (i <= j) {
            int mid = (i+j)/2;
            if(arr[mid] < n){
                i = mid + 1;
                floor = arr[mid];
            }else if(arr[mid] > n){
                j = mid - 1;
                ceil = arr[mid];
            }else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println("Ceil : "+ceil);
        System.out.println("Floor : "+floor);
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
        System.out.print("Enter number you want to find ceil and floor of : ");
        int n = sc.nextInt();
        findCeilFloor(arr, n);
    }
}
