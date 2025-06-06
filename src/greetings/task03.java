package greetings;

import java.util.Scanner;  // ✅ Import Scanner

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Output: " + sum);

        scanner.close();
    }
}
