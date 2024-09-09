package com.aki.leetcodes.LinkedList;

// LeetCode : 83
public class RemoveDuplicatesFromSortedList {

    // Space Complexity : O(1)
    public static ListNode deleteDuplicates(ListNode head) {

        // Resolve the beginning null and only one node in list
        if(head == null || head.next == null) return head ;

        ListNode currentNode = head ;

        while(currentNode.next != null) {

            if(currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next ;  // Cross a node
            } else {
                currentNode = currentNode.next ;
            }
        }

        return head ;
    }

    // Space Complexity : O(n), n is the len of list
    public static ListNode deleteDuplicatesUseRecursion(ListNode head) {

        if(head == null || head.next == null) return head ;

        head.next = deleteDuplicatesUseRecursion(head.next) ;

        return head.val == head.next.val ? head.next : head ;
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        System.out.println(deleteDuplicates(head1)) ;
        System.out.println(deleteDuplicatesUseRecursion(head1));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);
        System.out.println(deleteDuplicates(head2));
        System.out.println(deleteDuplicatesUseRecursion(head2));
    }
}
