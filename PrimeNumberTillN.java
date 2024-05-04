import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Low number : ");
        int low = sc.nextInt();
        System.out.print("Enter High number : ");
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            boolean flag = false; // prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = true; // not prime
                    break;
                }
            }
            if (flag == false) {
                System.out.println(i);
            }
        }
    }
}
