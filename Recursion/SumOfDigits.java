public class SumOfDigits {
    public static int sumOfDigits(int n){
        if(n >= 0 && n <= 9) return n;
        int ans = n%10 + sumOfDigits(n/10);
        // System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Sum of digits of : "+sumOfDigits(1234));
    }
}
