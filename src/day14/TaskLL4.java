package day14;

public class TaskLL4 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Add element to the circular linked list
    public void addElement(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Display the list
    public void displayElements() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.println("Circular Linked List:");
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    // Delete a node with a given value
    public void deleteElement(int value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node current = head;
        Node previous = tail;

        // Single node and it's the one to delete
        if (head == tail && head.data == value) {
            head = null;
            tail = null;
            System.out.println("Deleted the only node in the list.");
            return;
        }

        // Traverse to find the node
        do {
            if (current.data == value) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Deleted: " + value);
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Value not found: " + value);
    }

    // Main method
    public static void main(String[] args) {
        TaskLL4 list = new TaskLL4();

        // Add nodes
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);

        // Display before deletion
        list.displayElements();

        // Task 4: Delete a node
        list.deleteElement(20);  // Delete middle node
        list.deleteElement(10);  // Delete head
        list.deleteElement(40);  // Delete tail
        list.deleteElement(100); // Try to delete non-existing value

        // Display after deletion
        list.displayElements();
    }
}
