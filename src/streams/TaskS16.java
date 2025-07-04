package streams;
import java.util.*;
import java.util.stream.Collectors;

public class TaskS16 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 47, 50);

        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd Numbers:");
        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }
}
