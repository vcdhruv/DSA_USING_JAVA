package Bit_Manipulation;

import java.util.Scanner;

public class RightMostSetBitMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to find rsbm of : ");
        int n = sc.nextInt();
        int n_Twos_Complement = (~(n) + 1);
        int rsbm = n & n_Twos_Complement;
        System.out.println("Binary of " + n + " is : " + Integer.toBinaryString(n));
        System.out.println("Binary of " + n_Twos_Complement + " is : " + Integer.toBinaryString(n_Twos_Complement));
        System.out.println("--------------------x--------------------------");
        System.out.println("rsbm : n & (~n+1) = " + n + " & " + n_Twos_Complement + " is : " + rsbm );
        System.out.println("--------------------x--------------------------");
        System.out.println("Binary of " + rsbm + " is : " + Integer.toBinaryString(rsbm));

    }
}
