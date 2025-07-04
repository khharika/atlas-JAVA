public class Task12 {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        Task12 outer = new Task12();
        InnerClass inner = outer.new InnerClass(); // ✅ allowed
        System.out.println(inner.y + outer.x);     // Output: 15
    }
}

