class OuterClass13 {

    int x = 10;

    static class InnerClass {

        int y = 5;

    }

}

public class Task13 {

    public static void main(String[] args) {

        OuterClass13 myOuter = new OuterClass13();

        OuterClass13.InnerClass myInner = new OuterClass13.InnerClass();

        System.out.println(myInner.y + myOuter.x);

    }

}