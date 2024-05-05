import java.util.Scanner;

public class SumOfPrime {
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        boolean flag = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check is sum of prime or not : ");
        int n = sc.nextInt();
        if (isPrime(n) && isPrime(n-2)) {
            System.out.println("yes this number is sum of two prime numbers....");
        }else{
            System.out.println("no this number is not the sum of two prime numbers....");
        }
    }
}
