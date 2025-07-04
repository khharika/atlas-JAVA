package LinkedList;

import java.util.*;

public class LLTask14 {
    public static void main(String[] args) {
        LinkedList<String> lobj = new LinkedList<>();

        // Add elements to the linked list
        lobj.add("Prasunamba");
        lobj.add("Meher");
        lobj.add(".MK");
        lobj.add("hi");
        lobj.add("hello");

        // Create a Spliterator for the list
        Spliterator<String> sitobj = lobj.spliterator();

        // Print elements using forEachRemaining (a Spliterator method)
        System.out.println("Splitting the list:");
        sitobj.forEachRemaining(System.out::println);
    }
}

