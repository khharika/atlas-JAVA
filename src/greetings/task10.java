import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is greatest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is greatest");
        } else {
            System.out.println("num3 is greatest");
        }

        scanner.close();
    }
}
