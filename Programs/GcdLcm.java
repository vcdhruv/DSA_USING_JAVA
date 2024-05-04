package Programs;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        int dividend = (n2 > n1 ? n2 : n1);
        int divisor = (n2 < n1 ? n2 : n1);
        int remainder = dividend % divisor;
        int qoutient = dividend / divisor;
        while (remainder != 0) {
            dividend = divisor;
            divisor = remainder;
            qoutient = dividend / divisor;
            remainder = dividend % divisor;
        }
        int gcd = divisor;
        int lcm = (n1 * n2) / gcd;
        System.out.println("GCD Of " + n1 + " & " + n2 + " is : " + gcd);
        System.out.println("LCM of " + n1 + " & " + n2 + " is : " + lcm);
    }
}
