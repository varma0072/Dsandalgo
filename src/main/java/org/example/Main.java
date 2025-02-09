package org.example;

import org.example.dsa.singlelinkedlist.ListNode;
import org.example.dsa.singlelinkedlist.Solution;
import org.example.sums.recursion.BinarySearchRecursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Declare and comment dsa problem in main method");
        // 1.sum problem call methods changing dynamically
//        Addsum addsum = new Addsum();
//        int[] nums = {2,7,11,15};
//        int[] result = addsum.twoSum(nums,9);
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }

        //dsa singlelinkedlist
//        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.insertAtEnd(1);
//        singleLinkedList.insertAtEnd(2);
//        singleLinkedList.insertAtEnd(2);
//        singleLinkedList.insertAtEnd(4);
//        singleLinkedList.removeByValue(2);
//        singleLinkedList.printAllList();

        //Duplicate problem
//        DuplicateElementsInArray.executeThisMethodAsMain();
        //remove a value in given array
//        RemoveVal.executeThisMethodAsMain();

        /* practice problems */
//        Palandrome.executeThisMethodAsMain();
//   linked list two array merge function 
//     Solution solution = new Solution();
//     ListNode list1 = new ListNode(1);
//     list1.next = new ListNode(2);
//     list1.next.next = new ListNode(4);

     // Create second linked list: 1 -> 3 -> 4
//     ListNode list2 = new ListNode(1);
//     list2.next = new ListNode(3);
//     list2.next.next = new ListNode(4);
//     ListNode rNode =  solution.mergeTwoLists(list1, list2);
//     String rnoNodeString = "";
//     while (rNode != null) {
//        rnoNodeString =  rnoNodeString + rNode.val + " -> ";
//        rNode = rNode.next;
//     }
//     System.out.println(rnoNodeString);

        //Recursion Binary Search..
        BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
        System.out.println(binarySearchRecursion.searchTheArray(9));
    }
}