import java.util.Scanner;

public class practice {
    
    public static void main(String[] args){
        int n = 12345;
        int k = -1;
        int t = n;
        int numOfDigits = 0;
        while (n != 0) {
            n /=10;
            numOfDigits++;
        }
        if(k<1) k = k + numOfDigits;
        k = k % numOfDigits;
        n = t;
        int ans = (int)(n % Math.pow(10, k)) * (int)(Math.pow(10, numOfDigits-k)) + (int)(n / Math.pow(10, k));
        System.out.println(ans);
    }
}
