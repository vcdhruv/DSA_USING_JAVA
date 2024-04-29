package Assignments;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        int x = 2 , y = 4;
        System.out.println("Product:"+(x*y));
        int asciiU = 'U';
        System.out.println("ASCII VALUE OF U:"+asciiU);
        char asciiChar = 98;
        System.out.println("Ascii character of 98 number is : "+asciiChar);
        int length = 7 , breadth = 4;
        System.out.println("Area of rectangle:"+(length * breadth));
        int n = 4;
        System.out.println("cube:"+n*n*n);
        int a = 2 , b = 3;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : a :"+a+" , b:"+b);
    }
}
