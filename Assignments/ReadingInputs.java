package Assignments;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter name:");
        String name = sc.nextLine();
        
        System.out.print("Enter your roll number:");
        int rollNumber = sc.nextInt();
        
        System.out.print("Enter field of interest:");
        String fieldOfInterest = sc.next();

        System.out.print(name + " "+rollNumber+" "+fieldOfInterest);

        String x = sc.next();
        String y = sc.next();
        System.out.println(x+y);

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int totalMarks = mark1 + mark2 + mark3;
        int percentage = (totalMarks / 300)*100;
        System.out.println("Total marks:"+totalMarks);
        System.out.println("Percentage:"+percentage+"%");

        int testCases = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();



    }
}
