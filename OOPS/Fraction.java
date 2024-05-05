package OOPS;

import java.util.Scanner;

public class Fraction {

    public static int gcd(int a, int b) {
        int dividend = a > b ? a : b;
        int divisor = a < b ? a : b;
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }

    public static int[] add(fraction a , fraction b){
        int numerator = (a.numerator * b.denominator) + (b.numerator * a.denominator);
        int denominator = (a.denominator * b.denominator);
        return new int[]{numerator,denominator};
    }

    public static fraction mul(fraction a , fraction b){
        return new fraction((a.numerator * b.numerator), (a.denominator*b.denominator));
    }

    public static class fraction {
        int numerator;
        int denominator;
        static int numberOfFractions;

        public fraction(int numerator, int denominator) {
            numberOfFractions++;
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        public void printFractions() {
            System.out.println("Fraction : " + numerator + "/" + denominator);
        }

        public void simplify() {
            // calculating gcd of numerator and denominator and then dividing both by gcd
            int hcf = gcd(numerator, denominator);
            numerator = numerator / hcf;
            denominator = denominator / hcf;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to create fractions : ");
        int entry = sc.nextInt();
        while (entry != 0) {
            System.out.print("Enter numerator of fraction : ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator of fraction : ");
            int denominator = sc.nextInt();

            System.out.println("-----------------------------x----------------------------------------");
            System.out.println("Enter 1 to print fraction , 2 to add , 3 to multiply");
            System.out.print("Enter option : ");
            int option = sc.nextInt();

            fraction f1 = new fraction(numerator, denominator);

            if (option == 1) {
                f1.printFractions();
            }else if(option == 2){
                System.out.print("Enter numerator of fraction to be added : ");
                numerator = sc.nextInt();

                System.out.print("Enter denominator of fraction to be added : ");
                denominator = sc.nextInt();

                fraction f2 = new fraction(numerator, denominator);
                int[] credentials = add(f1, f2);
                f1.numerator = credentials[0];
                f1.denominator = credentials[1];
                f1.simplify();
                f1.printFractions();
            }else if(option == 3){
                System.out.print("Enter numerator of fraction to be multiplied : ");
                numerator = sc.nextInt();

                System.out.print("Enter denominator of fraction to be multiplied : ");
                denominator = sc.nextInt();

                fraction f2 = new fraction(numerator, denominator);
                f1 = mul(f1,f2);
                f1.printFractions();
            }else{
                System.out.println("Invalid option input...");
            }

            System.out.println("-----------------------------x----------------------------------------");

            System.out.print("Enter 0 to exit and 1 to create another : ");
            while (true) {
                entry = sc.nextInt();
                if (entry == 0 || entry == 1) {
                    break;
                }
                System.out.println("Invalid Input ......");
                System.out.print("Enter 0 to exit and 1 to create another : ");
            }
        }
        System.out.println("-----------------------------x----------------------------------------");
        System.out.println("Number Of Fractions created are : " + fraction.numberOfFractions);
    }
}
