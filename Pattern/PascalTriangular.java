package Pattern;

import java.util.Scanner;

public class PascalTriangular {
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int combination(int n , int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pascal's triangle : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j)+"\t");
            }
            System.out.println();
        }
    }
}
