package Arrays;

import java.util.Scanner;

public class AlternatePositiveNegative {

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void makeAlternative(int[] arr){
        int pcount = 0 , ncount = 0;
        for (int i : arr) {
            if (i > 0) {
                pcount++;
            }else{
                ncount++;
            }
        }
        int[] positive = new int[pcount];
        int[] negative = new int[ncount];
        int pindx = 0 , nindx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive[pindx] = arr[i];
                pindx++;
            }else{
                negative[nindx] = arr[i];
                nindx++;
            }
        }
        // printArray(positive);
        // printArray(negative);
        int index = 0;
        pindx = 0;
        nindx = 0;
        while (pcount != pindx && ncount != nindx) {
            arr[index] = negative[nindx];
            nindx++;
            index++;
            arr[index] = positive[pindx];
            pindx++;
            index++;
        }
        while (ncount != nindx) {
            arr[index] = negative[nindx];
            nindx++;
            index++;
        }
        while (pcount != pindx) {
            arr[index] = positive[pindx];
            pindx++;
            index++;
        }
        printArray(arr);
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
        printArray(arr);
        makeAlternative(arr);
    }
}
