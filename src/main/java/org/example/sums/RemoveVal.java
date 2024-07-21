package org.example.sums;

public class RemoveVal {
    // answer is okay
    public static void executeThisMethodAsMain(){
        RemoveVal removeVal = new RemoveVal();
        int[] nums = {3,2,2,3};
        int value = removeVal.removeElement(nums , 3);
        System.out.println(value);
    }
    public int removeElement(int[] nums, int val) {
        int count = 0;
    for(int single:nums){
        if(single != val){
            count += 1;
        }
    }
    return  count;
    }
}
