class ForPointing{
    String x , y;
}

public class PassByReference {
    public static void change(ForPointing fp2){
        fp2.x = "a";
        fp2.y = "b";
    }
    public static void main(String[] args) {
        ForPointing fp = new ForPointing();
        fp.x = "b";
        fp.y = "a";
        System.out.println("Before Changing , x : " + fp.x + " , y : " + fp.y);
        change(fp);
        System.out.println("After Changing , x : " + fp.x + " , y : " + fp.y);

    }
}
