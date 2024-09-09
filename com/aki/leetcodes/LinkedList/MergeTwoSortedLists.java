package com.aki.leetcodes.LinkedList;

// LeetCode : 21
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // The next node is that has smaller value
        if(list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {

        ListNode aList1 = new ListNode(1);
        aList1.next = new ListNode(2);
        aList1.next.next = new ListNode(4);

        ListNode aList2 = new ListNode(1);
        aList2.next = new ListNode(3);
        aList2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(aList1, aList2));


        ListNode bList1 = null ;
        ListNode bList2 = null ;
        System.out.println(mergeTwoLists(bList1, bList2));


        ListNode cList1 = null ;
        ListNode cList2 = new ListNode(0);
        System.out.println(mergeTwoLists(cList1, cList2));
    }
}
