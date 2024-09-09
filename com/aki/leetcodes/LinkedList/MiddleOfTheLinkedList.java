package com.aki.leetcodes.LinkedList;

// LeetCode : 876
public class MiddleOfTheLinkedList {

    // If the speed of second pointer is two times more than the first pointer,
    // it means that when second pointer meet or cross the end of node list, the first pointer also meet the middle.
    public static ListNode middleNode(ListNode head) {

        ListNode slowPointer = head ;
        ListNode fastPointer = head ;

        while(fastPointer != null && fastPointer.next != null) {

            slowPointer = slowPointer.next;     // Speed 1
            fastPointer = fastPointer.next.next;    // Speed 2 (1 * 2)
        }

        return slowPointer ;
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.println(middleNode(head1));


        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        System.out.println(middleNode(head2));
    }
}
