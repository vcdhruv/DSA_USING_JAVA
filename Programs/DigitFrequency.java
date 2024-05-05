package Programs;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        while (n != 0) {
            if (n % 10 == x) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Digit Frequency of "+x+" is : "+count);
    }
}
