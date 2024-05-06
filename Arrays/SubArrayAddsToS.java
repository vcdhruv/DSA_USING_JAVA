package Arrays;

import java.util.Scanner;

public class SubArrayAddsToS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter S : ");
        int s = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int temp = s - arr[i];
            for (int j = i+1; j < arr.length-1; j++) {
                if (temp < arr[j] || temp < 0) {
                    break;
                }
                else{
                    temp = temp - arr[j];
                    if (temp == 0) {
                        System.out.print(i + " " + j);
                        break;
                    }
                }
                // System.out.println(temp);
            }
        }
    }
}
