package Arrays;

import java.util.Scanner;

public class BarChart {
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static void generateBarChart(int[] arr){
        int maxBuildingSize = getMax(arr);
        building:for (int building = maxBuildingSize; building >= 1 ; building--) {
            floors:for (int floor : arr) { // if flooar <= building add more floors to buildings concept
                // System.out.print(i+","+j+" ");
                if (building > floor) {
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of bar chart : ");
        int size = sc.nextInt();
        int[] buildingSize = new int[size];
        for (int i = 0; i < buildingSize.length; i++) {
            System.out.print("Enter size " + (i+1) + " : ");
            buildingSize[i] = sc.nextInt();
        }
        System.out.println("Your bar chart is ready...");
        generateBarChart(buildingSize);
    }
}
