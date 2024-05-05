package OOPS;

class Objects{
    static int count = 0;
    Objects(){
        count++;
        System.out.println("Number Of Objects Created : " + count);
    }
}

public class CountObjectCreated {
    public static void main(String[] args) {
        int x = 5;
        while (x != 0) {
            Objects ob = new Objects();
            x--;
        }
    }
}
