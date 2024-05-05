class ForPointing{
    int x , y;
}

public class PassByReference {
    public static void change(ForPointing fp2){
        fp2.x = 2;
        fp2.y = 1;
    }
    public static void main(String[] args) {
        ForPointing fp = new ForPointing();
        fp.x = 1;
        fp.y = 2;
        System.out.println("Before Changing , x : " + fp.x + " , y : " + fp.y);
        change(fp);
        System.out.println("After Changing , x : " + fp.x + " , y : " + fp.y);

    }
}
