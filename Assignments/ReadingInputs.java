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

        System.out.print("name:"+name+"\nroll number:"+rollNumber+"\nfield of interest:"+fieldOfInterest);

        String x = sc.next();
        String y = sc.next();
        System.out.println(x+y);

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int totalMarks = mark1 + mark2 + mark3;
        int percentage = (totalMarks / 3);
        System.out.println("Total marks:"+totalMarks);
        System.out.println("Percentage:"+percentage+"%");

        int testCases = sc.nextInt();
        while (testCases > 0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            System.out.println(t1+t2);
            testCases--;
        }

        int numberOfLines = sc.nextInt();
        while (numberOfLines > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(s1+s2);
            numberOfLines--;
        }

    }
}
