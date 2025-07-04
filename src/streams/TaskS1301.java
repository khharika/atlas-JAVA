package streams;
import java.util.ArrayList;
import java.util.List;

public class TaskS1301 {
    public static void main(String[] args) {
        // Create a List of full names
        List<String> friends = new ArrayList<>();

        friends.add("Harika Kantipudi");
        friends.add("Ramya Kasu");
        friends.add("Shaik ayaz");
        friends.add("Raaga surendra");
        friends.add("vishala kshi");


        // Use Stream API to process the names
        System.out.println("Friends whose name starts with 'R':");
        friends.stream()
                .filter(p -> p.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}

