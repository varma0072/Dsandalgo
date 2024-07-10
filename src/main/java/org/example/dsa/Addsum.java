package org.example.dsa;

import java.util.HashMap;

public class Addsum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int temp =  target - nums[i];
           if(map.containsKey(temp)){
               return  new int[]{map.get(temp).intValue() , i};
           }else{
               map.put(nums[i],i);
           }
        }
        return new int[]{0,0};
    }
}
