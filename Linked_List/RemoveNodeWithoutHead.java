class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        solution.deleteNode(head.next);
    }
}