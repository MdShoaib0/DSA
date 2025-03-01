import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateLinkedList {

    Node head;

    CreateLinkedList() {
        this.head = null;
    }

    void append(int number) {

        Node newNode = new Node(number);
        Node current = head;

        if (head == null) {
            head = newNode;
        }else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void displayLinkedList() {

        if (head == null) {
            System.out.println("LinkedList is Empty !");
        }

        Node current = head;

        while (current != null) {  
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void reverseLinkedList() {

        Node current = head;

        ArrayList<Node> list = new ArrayList<>();

        while (current != null) {
            list.add(current);
            current = current.next;
        }

        ArrayList<Node> reverse = new ArrayList<>();

        for(int i = list.size()-1; i >= 0; i--) {
            reverse.add(list.get(i));
        }

        displayLinkedList(reverse.get(0));

        // System.out.println(reverse);
    }

    public static void displayLinkedList(Node NodeHead) {

        if (NodeHead == null) {
            System.out.println("LinkedList is Empty !");
        }
    
        Node current = NodeHead;
    
        while (current != null) {  
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

class Main {
    public static void main(String[] args) {
        
        CreateLinkedList NodeList = new CreateLinkedList();

        NodeList.append(10);
        NodeList.append(20);
        NodeList.append(30);
        NodeList.append(40);
        NodeList.append(50);

        NodeList.reverseLinkedList();


    }
}
