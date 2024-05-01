package Programs;

public class convertLowerCaseToUpperAndUpperCaseToLower {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("PhysICS");
        for (int i = 0; i < sb.length(); i++) {
            int asciiValue = sb.charAt(i);
            System.out.println("ascii value of " + sb.charAt(i) + " is : " + asciiValue);
            sb.setCharAt(i, asciiValue >= 65 && asciiValue <= 90 ? (char)(asciiValue + 32) : (char)(asciiValue - 32));
        }
        System.out.println("After Replacement String : " + sb);
    }
}
