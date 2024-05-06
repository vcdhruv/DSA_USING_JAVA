package Arrays;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arrival = {900,940,950,1100,1500,1800};
        int[] departure = {910,1200,1120,1130,1900,2000};
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int numberOfPlatforms = 0;
        int index = 1;
        for (int i = 0; i < departure.length - 1; i++) {
            int a = arrival[index];
            int d = departure[i];
            if (a > d) {
                index++;
                a = arrival[index];
            }else{
                index++;
                numberOfPlatforms++;
            }
        }
        System.out.println(numberOfPlatforms);
    }
}
