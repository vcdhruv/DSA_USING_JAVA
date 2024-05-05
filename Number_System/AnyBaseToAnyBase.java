package Number_System;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.print("Tell base of number entered : ");
        int base = sc.nextInt();
        System.out.print("Tell base to be converted to : ");
        int cbase = sc.nextInt();
        int pw = 1 , answer = 0;
        int original_n = number;
        while (number != 0) {
            if(cbase == 10){
                answer += (number % 10) * pw;
                pw*=base;
                number /= 10;
            }else{
                answer += (number % cbase) * pw;
                pw*=10;
                number /= cbase;
            }
        }
        System.out.println("Answer Of "+original_n+" of base "+base+" to base "+cbase+" is : "+answer);
    }
}
