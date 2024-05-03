package Programs;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exponenet : ");
        int exponenet = sc.nextInt();
        int ans = 1;
        while (exponenet > 0) {
            ans = ans * base;
            exponenet--;
        }
        System.out.println("answer : " + ans);
    }
}
