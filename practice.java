import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int n = 1010;
        int answer = 0 , pw = 1 , original_number = n;
        while (n != 0) {
            answer = answer + (n % 10) * pw;
            pw *= 2;
            n = n / 10;
        }
        System.out.println("Decimal Number Of " + original_number + " is : " + answer);
    }
}
