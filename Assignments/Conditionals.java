package Assignments;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth : ");
        int b = sc.nextInt();
        System.out.println(l==b?"it is square":"it is rectangle");

        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.println(x < 0 ? "Absolute number : " + x * ( -1 ) : "Absolute number" + x);

        System.out.print("Enter cost price : ");
        int costPrice = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sellPrice = sc.nextInt();
        System.out.println(sellPrice > costPrice ? "Profit : " + (sellPrice - costPrice) : "\n Loss : " + ( costPrice - sellPrice ));
        
        System.out.print("Enter a number : ");
        int n2 = sc.nextInt();
        if(n2 > 0){
            System.out.print("Number entered is : " + n2);
        }

        System.out.println("Calculator");
        System.out.print("Enter an operator ( +,-,*,/ ) : ");
        String operator = sc.next();
        System.out.print("Enter Two Numbers : ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        switch (operator) {
            case "+":System.out.print("result:"+(a1 + a2));
                     break;
            case "-":System.out.print("result:"+(a1 - a2));
                     break;
            case "*":System.out.print("result:"+(a1 * a2));
                     break;
            case "/":System.out.print("result:"+(a1 / a2));
                     break;
        }

        System.out.print("Enter Your Marks : ");
        int marks = sc.nextInt();
        if(marks >= 0 && marks < 30){
            System.out.print("Grade : F");
        }else if(marks >= 30 && marks < 40){
            System.out.println("Grade : E");
        }else if(marks >= 40 && marks < 50){
            System.out.println("Grade : D");
        }else if(marks >= 50 && marks < 60){
            System.out.println("Grade : C");
        }else if(marks >= 60 && marks < 70){
            System.out.println("Grade : B");
        }else if(marks >= 70 && marks < 80){
            System.out.println("Grade : B+");
        }else if(marks >= 80 && marks < 90){
            System.out.println("Grade : A");
        }else if(marks >= 90 && marks < 100){
            System.out.println("Grade : A+");
        }
    }
}
