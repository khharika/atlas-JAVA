package streams;
import java.util.*;

public class TaskS13 {
    public static void main(String[] args) {
        // Create a List to store friends' names
        List<String> friends = new ArrayList<>();

        // Add 5 friends' full names
        friends.add("Rahul Sharma");
        friends.add("Priya Mehta");
        friends.add("Amit Patel");
        friends.add("Sneha Kapoor");
        friends.add("Ravi Verma");

        // Display the list of friends
        System.out.println("List of Friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}

