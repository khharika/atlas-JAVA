package streams;

import java.util.*;
import java.util.stream.Collectors;

public class TaskS17 {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate values
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 20, 50, 30);

        // Use stream to remove duplicates
        List<Integer> noDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Display the result
        System.out.println("Original List: " + numbers);
        System.out.println("List after removing duplicates: " + noDuplicates);
    }
}
