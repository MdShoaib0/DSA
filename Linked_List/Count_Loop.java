import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Count_Loop {
    public static int countNodesinLoop(Node head) {
        Set<Node> set = new HashSet<>();
        
        Node current = head;
        Node temp = null;
        
        if (head == null) {
            return 0;
        }
        
        set.add(current);
        
        current = current.next;
        
        while(current != null) {
            if(set.contains(current)) {
                temp = current;
                break;
            } else {
                set.add(current);
                current = current.next;
            }
        }
        
        if(temp == null) {
            return 0;
        }
        
        current = temp;
        int count = 1;
        
        while(current.next != temp) {
            count++;
            current = current.next;
        }
        
        return count;
    }
    
    public static Node createListWithLoop(int[] arr, int loopStart) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        Node loopNode = null;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
            if (i == loopStart) {
                loopNode = current;
            }
        }
        
        if (loopStart >= 0 && loopStart < arr.length) {
            current.next = loopNode;
        }
        
        return head;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Test Case 1: Linked List with loop");
        int[] arr1 = {1, 2, 3, 4, 5};
        int loopStart1 = 2;
        Node head1 = createListWithLoop(arr1, loopStart1);
        int result1 = countNodesinLoop(head1);
        System.out.println("Number of nodes in loop: " + result1);
        
        System.out.println("\nTest Case 2: Linked List without loop");
        int[] arr2 = {1, 2, 3, 4, 5};
        int loopStart2 = -1;
        Node head2 = createListWithLoop(arr2, loopStart2);
        int result2 = countNodesinLoop(head2);
        System.out.println("Number of nodes in loop: " + result2);
        
        System.out.println("\nEnter your own test case:");
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position to start loop (0-based index, -1 for no loop): ");
        int loopStart = sc.nextInt();
        
        Node head = createListWithLoop(arr, loopStart);
        int result = countNodesinLoop(head);
        System.out.println("Number of nodes in loop: " + result);
        
        sc.close();
    }
}