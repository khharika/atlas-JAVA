package ds;

import java.util.*;

public class DSTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Original List: " + numbers);

        System.out.println("Reversed List:");
        // Display in reverse order using a loop
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }

        sc.close();
    }
}
