package Arrays;

import java.util.Scanner;

public class SearchElement {
    public static int Search(int[] arr,int find){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
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
        System.out.print("Search : ");
        int search = sc.nextInt();
        
        int element = Search(arr, search);
        System.out.println(element == -1 ? "Not Found" : "Found at "+element);
    }
}
