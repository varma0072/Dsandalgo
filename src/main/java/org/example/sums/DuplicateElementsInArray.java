package org.example.sums;

import java.util.Arrays;

public class DuplicateElementsInArray {
    public int[] removeDuplicatesInArray(int[] duplicateArray){
        int[] noDuplicateArray = duplicateArray;
        noDuplicateArray[0] = duplicateArray[0];
        int noDuplicateArrayCount = 0;
        for(int i=1;i<duplicateArray.length;i++){
            if(duplicateArray[i] != duplicateArray[i-1]){
                noDuplicateArrayCount += 1;
                duplicateArray[noDuplicateArrayCount] = duplicateArray[i];
            }
        }

        return Arrays.copyOfRange(noDuplicateArray,0,noDuplicateArrayCount);
    }

    public static void executeThisMethodAsMain(){
        DuplicateElementsInArray duplicateElementsInArray = new DuplicateElementsInArray();
        int[] array = {1,1,2,2,3,4,5,5,6,7,7,7,8};
        System.out.println(Arrays.toString(duplicateElementsInArray.removeDuplicatesInArray(array)));
    }
}
