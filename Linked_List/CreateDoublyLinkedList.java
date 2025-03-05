class ListNode {

    int data;
    ListNode next;
    ListNode prev = null;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateDoublyLinkedList {

    ListNode head;
    ListNode tail;

    public CreateDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void appendLast(int key) {
        ListNode newNode = new ListNode(key);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = head;
            head = newNode;
        }
    }

    public void appendStart(int start) {

        ListNode newNode = new ListNode(start);

        if (head == null) {
            head = tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void displayBackward() {

        if (tail == null) {
            return;
        }

        ListNode temp = tail;

        while (temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.prev;
        }
        System.out.println(" null");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }

        ListNode current = head;

        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println();  // Just to move to the next line after printing the list
    }
}

class Main {

    public static void main(String[] args) {
        CreateDoublyLinkedList linkedListAppend = new CreateDoublyLinkedList();

        linkedListAppend.appendStart(100);
        linkedListAppend.appendStart(200);
        linkedListAppend.appendStart(300);
        linkedListAppend.appendStart(400);
        linkedListAppend.appendStart(500);

        linkedListAppend.displayForward();  // Displays the list from head to tail
        linkedListAppend.displayBackward();
    }
}
