class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Solution {
    
    Node addNode(Node head, int p, int x) {
    
        Node newNode = new Node(x);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        for (int i = 0; i < p && temp.next != null; i++) {
            temp = temp.next;
        }
        Node current = temp.next;

        newNode.prev = temp;
        newNode.next = current;
        temp.next = newNode;

        if (current != null) {
            current.prev = newNode;
        }

        return head;
    }
    
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InserIntDoublyLinkedList {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original Doubly Linked List:");
        solution.printList(head);

        head = solution.addNode(head, 2, 25);

        System.out.println("Doubly Linked List after insertion:");
        solution.printList(head);
    }
}
