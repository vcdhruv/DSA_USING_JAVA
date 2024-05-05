package OOPS;

import java.util.Scanner;

public class ArrayOfObjects {
    public static class Employee {
        String name;
        int age;
        double salary;
    }
    public static void main(String[] args){
        Employee[] e = new Employee[2];
        Scanner sc = new Scanner(System.in);
        Input:for (int i = 0; i < 2; i++) {
            e[i] = new Employee(); // Instantiate each Employee object
            System.out.println("Enter name of employee " + i + ":");
            e[i].name = sc.nextLine();
            System.out.println("Enter age of employee " + i + ":");
            e[i].age = sc.nextInt();
            System.out.println("Enter salary of employee " + i + ":");
            e[i].salary = sc.nextDouble();
            sc.nextLine(); // consume newline character left in buffer after nextDouble()
        }
        Print:for (int i = 0; i < e.length; i++) {
            System.out.println("Name of employee " + i + " is : "+e[i].name);
            System.out.println("Age of employee " + i + " is : "+e[i].age);
            System.out.println("Salary of employee " + i + " is : "+e[i].salary);
        }
    }
}
