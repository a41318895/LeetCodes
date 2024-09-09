package com.aki.leetcodes.LinkedList;

// LeetCode : 141
public class LinkedListCycle {

    // If there's a single-way node list, they never meet.
    // If there's a cycle node list, the slowPointer one day will be caught by the fastPointer
    public static boolean hasCycle(ListNode head) {

        ListNode slowPointer = head ;   // move one step one time
        ListNode fastPointer = head ;   // move two steps one time

        while(fastPointer != null && fastPointer.next != null) {

            slowPointer = slowPointer.next ;
            fastPointer = fastPointer.next.next ;

            if(slowPointer == fastPointer) return true ;    // If they meet, it says that there's a cycle.
        }

        return false ;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2 ;
        node2.next = node3 ;
        node3.next = node4 ;
        node4.next = node2 ;
        System.out.println(hasCycle(node1));


        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        node5.next = node6 ;
        node6.next = node5 ;
        System.out.println(hasCycle(node5));


        ListNode node7 = new ListNode(1);
        System.out.println(hasCycle(node7));

    }
}
