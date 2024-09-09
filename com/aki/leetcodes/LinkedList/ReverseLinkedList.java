package com.aki.leetcodes.LinkedList;

// LeetCode : 206
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode preNode = null ;   // Init that head node has no preNode
        ListNode currentNode = head ;
        ListNode nextNode = null ;  // Init that head node hasn't ensured any nextNode existing

        while(currentNode != null) {

            nextNode = currentNode.next ;   // make the next node be nextNode
            currentNode.next = preNode ;    // make the current node point to preNode

            preNode = currentNode ;     // make the currentNode now be preNode
            currentNode = nextNode ;    // make the nextNode now be currentNode
        }

        return preNode ;    // preNode is the new head node now (pre -> current -> next)
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.println(reverseList(head1));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println(reverseList(head2));

        ListNode head3 = null ;
        System.out.println(reverseList(head3));
    }
}
