package Bit_Manipulation;

import java.util.Scanner;


public class OnOffToggleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter i'th bit for on : ");
        int i = sc.nextInt();
        System.out.print("Enter j'th bit for off : ");
        int j = sc.nextInt();
        System.out.print("Enter k'th bit for toggle : ");
        int k = sc.nextInt();
        System.out.print("Enter m'th bit to check whether it is on or off : ");
        int m = sc.nextInt();
        int onmask = (1 << i); // bracket is imp bcauz precedance of << is less then =
        int offmask = ~(1 << j); 
        int tmask = (1 << k);
        int cmask = (1 << m);
        System.out.println("i'th bit on : "+(n | onmask));
        System.out.println("j'th bit off : "+(n & offmask));
        System.out.println("k'th bit toggle : "+(n ^ tmask));
        System.out.println("m'th bit for check : "+((n & cmask)==0?"off":"on"));
    }
    
}
