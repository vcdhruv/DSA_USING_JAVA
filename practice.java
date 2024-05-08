import java.util.Scanner;

public class practice {
    
    public static void main(String[] args){
        int[] buildingSize = {1,5,3,4,2};
        int maxBuildingSize = buildingSize[0];
        for (int i : buildingSize) {
            if (i > maxBuildingSize) {
                maxBuildingSize = i;
            }
        }
        for (int building = maxBuildingSize; building >= 1; building--) {
            for (int floor : buildingSize) {
                // System.out.print(building+","+floor+" ");
                if (building > floor) {
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
