package Arrays;

import java.util.Scanner;

public class ArrayMethods {

    public <T> void printElements(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i+1)+" : "+array[i]);
        }
    }

    public <T> void input(T[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            if (array[i] instanceof Integer) {
                array[i] = (T) (Integer.valueOf(scanner.nextInt()));
            } else if (array[i] instanceof Double) {
                array[i] = (T) (Double.valueOf(scanner.nextDouble()));
            } else if (array[i] instanceof String) {
                array[i] = (T) scanner.next();
            } 
        }
    }
}
