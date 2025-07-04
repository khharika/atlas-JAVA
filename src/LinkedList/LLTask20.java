package LinkedList;

public class LLTask20 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail of the list
    Node head = null;
    Node tail = null;

    // Method to add a node to circular linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Points to itself
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        }
    }

    // Method to display the circular linked list
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Circular Linked List elements:");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        LLTask20 cll = new LLTask20();

        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        cll.display();
    }
}

