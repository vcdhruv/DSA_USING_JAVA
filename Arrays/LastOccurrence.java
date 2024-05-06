package Arrays;

import java.util.Scanner;

public class LastOccurrence {
    public static int LastOccurrenceOfElement(int[] arr , int findElement){
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == findElement) {
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
        System.out.print("Which element we should count ? : ");
        int findElement = sc.nextInt();
        System.out.println("Last Occurrence Of "+findElement+" is : "+LastOccurrenceOfElement(arr, findElement));
    }
}
