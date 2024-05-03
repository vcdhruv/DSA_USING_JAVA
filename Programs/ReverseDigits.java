package Programs;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt() , temp = n , ans = 0;
        if(n < 0) temp = temp * -1;
        while(temp > 0){
            ans = 10 * ans + temp % 10;
            temp = temp / 10;
        }
        if(n < 0) ans = ans * -1;
        System.out.println("Reverse Number Of " + n + " is : " + ans);
    }
}
