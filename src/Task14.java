class OuterClass14 {
    int x = 50;

    class InnerClass {
        public int innerMethod() {
            return x;  // Direct access to outer class variable
        }
    }
}

public class Task14 {
    public static void main(String[] args) {
        OuterClass14 myOuter = new OuterClass14();
        OuterClass14.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.innerMethod());  // Output: 50
    }
}
