package Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1 : ");
        int size_1 = sc.nextInt();
        int[] arr_1 = new int[size_1];
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print("Enter size " + (i+1) + " : ");
            arr_1[i] = sc.nextInt();
        }
        System.out.print("Enter size of array 2 : ");
        int size_2 = sc.nextInt();
        int[] arr_2 = new int[size_2];
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print("Enter size " + (i+1) + " : ");
            arr_2[i] = sc.nextInt();
        }
        int r_size = size_1 > size_2 ? size_1 : size_2;
        int[] result = new int[r_size];
        int carry = 0;
        size_1--;
        size_2--;
        r_size--;
        while (r_size >= 0) {
            int sum = carry;
            if(size_1 >= 0) sum += arr_1[size_1];
            if(size_2 >= 0) sum += arr_2[size_2];
            carry = sum / 10;
            sum = sum % 10;
            result[r_size] = sum;
            size_1--;
            size_2--;
            r_size--;
        }
        if (carry != 0) {
            System.out.print(carry+" ");
        }
        
        printArray(result);
    }
}
