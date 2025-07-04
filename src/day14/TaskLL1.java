package day14;

public class TaskLL1 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    Node head = null;


    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display all elements
    public void display() {
        Node current = head;
        System.out.print("Linked List Elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // for newline
    }


    public static void main(String[] args) {
        TaskLL1 list = new TaskLL1();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        list.display();
    }
}

