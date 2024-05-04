package Programs;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers space separated : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int hypotenuse = a > b ? (a > c ? a : c) : (b > c ? b : c);
        if (a == hypotenuse) {
            if (b * b + c * c == a * a) {
                System.out.println("it is a triplet");
            }else{
                System.out.println("not a triplet");
            }
        }else if(b == hypotenuse){
            if (a * a + c * c == b * b) {
                System.out.println("it is a triplet");
            }else{
                System.out.println("not a triplet");
            }
        }else{
            if (a * a + b * b == c * c) {
                System.out.println("it is a triplet");
            }else{
                System.out.println("not a triplet");
            }
        }
    }
}
