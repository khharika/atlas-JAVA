// Node class - accepts any kind of data using Object
class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
public class LLTask4 {
    private Node head;
    private int size;

    public LLTask4() {
        head = null;
        size = 0;
    }

    // Add data at the end of the list
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // First node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // Add to the end
        }
        size++;
    }

    // Remove a node at a given index
    public void removeAt(int index) {
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }

            if (index == 0) {
                head = head.next;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }

            size--;
            System.out.println(" Removed node at index " + index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }

    // Display the full list
    public void display() {
        if (head == null) {
            System.out.println(" List is empty.");
            return;
        }

        Node current = head;
        System.out.print(" Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }

    // Main method to test functionality
    public static void main(String[] args) {
        LLTask4 list = new LLTask4();

        // Create nodes and add values
        list.add(100);            // int
        list.add("Hello");        // String
        list.add(3.14);           // double
        list.add('A');            // char
        list.add(true);           // boolean

        // Display list
        list.display();

        // Display size
        System.out.println(" Size of list: " + list.getSize());

        // Remove a valid node
        list.removeAt(2); // removes 3.14
        list.display();
        System.out.println(" Updated size: " + list.getSize());

        // Try removing with an invalid index
        list.removeAt(10); // index out of bounds

        // Final list
        list.display();
    }
}
