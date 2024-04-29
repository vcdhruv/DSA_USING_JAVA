package Programs;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal = sc.nextInt();
        int binary = 0 , pw = 1 ; //since 10 ^ 0 is 1
        while (decimal > 0) {
            int parity = decimal % 2;
            binary += parity * pw;
            pw *= 10;
            decimal /= 2;
        } 
        System.out.println("Binary Number : "+binary);
    }
}
