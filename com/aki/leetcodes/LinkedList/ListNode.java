package com.aki.leetcodes.LinkedList;

// Common ListNode Class for problem fixing
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val ;
    }

    public ListNode(int val, ListNode next) {
        this.val = val ;
        this.next = next ;
    }

    // Avoid printing out the node is null
    @Override
    public String toString() {
        return val + ( next != null ? ", " + next : "") ;
    }
}