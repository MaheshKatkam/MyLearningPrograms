package com.mylearnings.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndMinimumSubArrayDemo {

    public static void main(String[] args) {
        int [] num = {2,3,1,2,4,3};
        int target = 8;
        int[] targetSubArray = null ;
        for (int start = 0; start < num.length; start++) {
            // Inner loop to mark the ending index
            for (int end = start; end < num.length; end++) {
                int[] subarray = new int[end - start + 1];
                for (int k = start; k <= end; k++) {
                    subarray[k - start] = num[k];
                    System.out.println(Arrays.toString(subarray));
                }
                int sum = 0 ;
                for(int i = 0 ; i < subarray.length ;i++){
                    sum = sum + subarray[i];
                }
                if(sum ==target){
                    if(targetSubArray == null){
                        targetSubArray = subarray;
                    }else {
                       if(targetSubArray.length > subarray.length){
                           targetSubArray = subarray;
                       }
                    }
                }
            }
        }

        System.out.println("Target Array  is : "+ Arrays.toString(targetSubArray));

    }
}
