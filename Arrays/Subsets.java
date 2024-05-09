package Arrays;

import java.util.Scanner;

public class Subsets {
    public static void generateAllSubsetsUsingBinary(int[] arr){
        int limit = (int)Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if(r == 0){
                    set = "_\t"+set;
                }else{
                    set = arr[j]+"\t"+set;
                }   
            }
            System.out.println(set);
        }
    }
    public static void generateAllSubsets(int[] arr){
        System.out.println("Total subsets are : "+(int)Math.pow(2, arr.length));
        System.out.println(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (i == j) {
                    System.out.println(arr[i]);
                }else{
                    System.out.println(arr[j]+""+arr[i]);
                }
                // System.out.println(i+","+j);
            }
        }
        StringBuilder sb = new StringBuilder("");
        for (int i : arr) {
            sb.append(i);
        }
        System.out.println(sb.toString());
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
        // generateAllSubsets(arr);
        generateAllSubsetsUsingBinary(arr);
    }
}
