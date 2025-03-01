class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        // Create dummy node to simplify logic
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // Continue while there are digits to process or carry exists
        while (num1 != null || num2 != null || carry != 0) {
            // Get values from nodes, use 0 if node is null
            int x = (num1 != null) ? num1.val : 0;
            int y = (num2 != null) ? num2.val : 0;
            
            // Calculate sum and new carry
            int total = x + y + carry;
            carry = total / 10;
            int digit = total % 10;
            
            // Create new node with calculated digit
            current.next = new ListNode(digit);
            current = current.next;
            
            // Move to next nodes if they exist
            num1 = (num1 != null) ? num1.next : null;
            num2 = (num2 != null) ? num2.next : null;
        }
        
        // Return head of result list (skip dummy node)
        return dummy.next;
    }

    // Helper method to create linked list from array (for testing)
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print linked list (for testing)
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: 45 + 345 = 390
        ListNode num1 = createList(new int[]{4, 5});
        ListNode num2 = createList(new int[]{3, 4, 5});
        ListNode result1 = solution.addTwoNumbers(num1, num2);
        System.out.print("Test 1: ");
        printList(result1);  // Expected: 3 -> 9 -> 0
        
        // Test case 2: 63 + 7 = 70
        ListNode num3 = createList(new int[]{0, 0, 6, 3});
        ListNode num4 = createList(new int[]{0, 7});
        ListNode result2 = solution.addTwoNumbers(num3, num4);
        System.out.print("Test 2: ");
        printList(result2);  // Expected: 7 -> 0
    }
}