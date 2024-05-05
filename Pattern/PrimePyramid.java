package Pattern;

import java.util.Scanner;

public class PrimePyramid {
    public static boolean prime(int x){
        int count = 0; // to count divisibility
            for (int i = 2; i * i <= x ; i++) {
                if(x % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                // System.out.println("Prime");
                return true;
            }else{
                // System.out.println("Not Prime");
                return false;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of prime pyramid : ");
        int size = sc.nextInt();
        int val = 2;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                while (prime(val) == false) {
                    val++;
                }
                System.out.print(val + " ");
                val = val + 1; //if value is prime then also it should be incremented.
            }
            System.out.println();
        }
        
    }
}
 