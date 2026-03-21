package Module10;

// All Module 10 Questions

// Node class for Linked List
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListPrograms {

    // Q1: Display the Linked List
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Q2: Insert a node at the beginning
    static Node insertBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    // Q3: Insert a node at the end
    static Node insertEnd(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Q4: Delete a node by value
    static Node deleteNode(Node head, int key) {
        if (head == null) return null;

        if (head.data == key) return head.next;

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // Q5: Count number of nodes in the list
    static int countNodes(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Node head = null;

        // Q1: Create and display linked list
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.print("Linked List: ");
        display(head);

        // Q2: Insert at beginning
        head = insertBeginning(head, 5);
        System.out.print("After inserting at beginning: ");
        display(head);

        // Q3: Insert at end
        head = insertEnd(head, 40);
        System.out.print("After inserting at end: ");
        display(head);

        // Q4: Delete node
        head = deleteNode(head, 20);
        System.out.print("After deleting 20: ");
        display(head);

        // Q5: Count nodes
        System.out.println("Number of nodes: " + countNodes(head));
    }
}