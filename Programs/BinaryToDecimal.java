package Programs;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary = sc.nextInt();
        int decimal = 0 , pw = 1 ;//since 2^0 is 1
        while ( binary > 0 ) {
            decimal += ( binary % 10 ) * pw;
            binary = binary / 10;
            pw = pw * 2;
        }
        System.out.println("Decimal Number is : " + decimal);
    }
}
