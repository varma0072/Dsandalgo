package org.example.dsa.singlelinkedlist;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rListNode = new ListNode();
        ListNode list1current = list1;
        ListNode list2current = list2;


        while(list1current != null ){
            rListNode.val = list1current.val;
            rListNode.next = new ListNode();

            rListNode = rListNode.next;
            list1current = list1current.next;

        }
        return rListNode;
    }
}
