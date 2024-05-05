package OOPS;

import java.util.Scanner;

public class Complex {
    int r,i;
    Complex(int real,int imag){
        r=real;
        i=imag;
    }

    public static Complex Sum(Complex a,Complex b){
        return new Complex((a.r+b.r), (a.i+b.i));
    }

    public static Complex Diff(Complex a , Complex b){
        return new Complex((a.r-b.r), (a.i-b.i));
    }

    public static Complex Mul(Complex a , Complex b){
        return new Complex((a.r*b.r)-(a.i*b.i), (a.r*b.i)+(a.i*b.r));
    }

    public void printComplex(){
        if(r == 0 && i != 0){
            System.out.println(i+"i");
        }else if(r != 0 && i == 0){
            System.out.println(r);
        }else{
            System.out.println(r+"+"+i+"i");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter real part of complex number 1: ");
        int real1 = scn.nextInt();
        System.out.println("Enter complex part of complex number 1 without iota sign: ");
        int comp1 = scn.nextInt();
        System.out.println("Enter real part of complex number 2: ");
        int real2 = scn.nextInt();
        System.out.println("Enter complex part of complex number 2 without iota sign: ");
        int comp2 = scn.nextInt();
        Complex c = new Complex(real1, comp1);
        Complex d = new Complex(real2, comp2);
        Complex e = Complex.Sum(c,d);
        Complex f = Complex.Diff(c,d);
        Complex g = Complex.Mul(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
