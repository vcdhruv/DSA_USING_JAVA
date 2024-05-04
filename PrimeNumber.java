import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many testcase you want? ");
        int t = sc.nextInt();
        while (t != 0) {
            System.out.print("Enter number you want to test : ");
            int n = sc.nextInt();
            int count = 0; // to count divisibility
            for (int i = 2; i * i <= n ; i++) {
                if(n % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
            t--; 
        }
    }
}
