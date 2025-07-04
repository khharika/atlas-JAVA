package streams;
import java.util.ArrayList;

public class TaskS12 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> friends = new ArrayList<>();

        // Add 5 friend names
        friends.add("harika");
        friends.add("Ramya");
        friends.add("Shaik ayaz");
        friends.add("raaga");
        friends.add("vishala");

        // Display the names
        System.out.println("My Friends:");
        for (String name : friends) {
            System.out.println(name);
        }
    }
}
