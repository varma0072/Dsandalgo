package org.example.sums.recursion;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchRecursion {

    public int searchTheArray(int targetValue){
        ArrayList<Integer> inputArray = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        return  findElementInArray(0,9 , inputArray , targetValue);
    }

    public static int findElementInArray(int startIndex , int endIndex , ArrayList<Integer> inputArray, int tragetValue){
        if(startIndex > endIndex){
            return -1;
        }

        int midIndex = startIndex + (endIndex - startIndex)/2;

        if(tragetValue == inputArray.get(midIndex)){
         return midIndex;
        }

        if(tragetValue > inputArray.get(midIndex)){
            return findElementInArray(midIndex+1 , endIndex , inputArray , tragetValue);
        }

        return  findElementInArray(startIndex , midIndex-1 , inputArray , tragetValue);
    }
}
