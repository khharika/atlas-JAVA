package LinkedList;

import java.util.LinkedList;

public class LLTask6 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");


        System.out.println("Linked List Elements: " + myList);
        String firstElement = myList.getFirst();
        String lastElement = myList.getLast();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }

    public void add(int i) {
    }

    public void displayBackward() {
    }

    public void displayForward() {
    }
}
