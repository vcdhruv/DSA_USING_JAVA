package Programs;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt() , numOfDig = 0 ;
        int original_number = n;
        while (n != 0) {
            n /= 10;
            numOfDig++;
        }
        n = original_number;
        int answer = 0;
        System.out.println(n);
        int div = (int)Math.pow(10, numOfDig - 1);
        while (div != 0) {
            int qoutient = n / div;
            answer = answer + numOfDig * (int)Math.pow(10, qoutient);
            n = n % div;
            div /= 10;
            numOfDig--;
        }
        System.out.println("Inverse Of " + original_number + " is : " + answer / 10);
    }
}
