public class PassByValue {
    static void changeValue(int a){
        a*=100;
        System.out.println("Inside change value function a : " + a);
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changing a : " + a);
        changeValue(a);
        System.out.println("After Changing a : " + a);
    }
}
