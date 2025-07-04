
class OuterClass11 {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
}

public class Task11 {
    public static void main(String[] args) {
        OuterClass11 myOuter = new OuterClass11();
        OuterClass11.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
