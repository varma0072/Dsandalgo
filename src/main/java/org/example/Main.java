package org.example;

import org.example.dsa.singlelinkedlist.SingleLinkedList;
import org.example.sums.Addsum;

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
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertAtEnd(4);
        singleLinkedList.insertAtEnd(5);
        singleLinkedList.insertAtTheBegining(2);
        singleLinkedList.insertAtTheBegining(3);
        singleLinkedList.removeByValue(2);
        singleLinkedList.printAllList();
    }
}