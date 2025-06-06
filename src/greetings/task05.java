package greetings;

public class task05 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 4;

        System.out.println("Add: " + add(x, y));
        System.out.println("Subtract: " + subtract(x, y));
        System.out.println("Multiply: " + multiply(x, y));
        System.out.println("Divide: " + divide(x, y));
    }
}
