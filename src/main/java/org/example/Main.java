package org.example;

import org.example.dsa.Addsum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Declare and comment dsa problem in main method");
        // call methods changing dynamically
        Addsum addsum = new Addsum();
        int[] nums = {2,7,11,15};
        int[] result = addsum.twoSum(nums,9);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}