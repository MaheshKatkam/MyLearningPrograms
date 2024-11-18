package com.mylearnings.programs;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArrayDemo {

    public static void main(String[] args) {
        int[] arr = {7,6,6,7,9,9,6,1,1,2,2,3,3,3,3,4,4};

        int[] result = new int[arr.length];
        result[0] = arr[0];
        int index = 0;

        for(int i=0 ; i < arr.length ; i++){
            boolean isFound = false;
            for(int j = 0; j<=index ; j++){
                if(arr[i] == result[j]){
                    isFound = true;
                    break;
                }
            }
            if(isFound == false){
                index++;
                result[index] = arr[i];
            }
        }
        System.out.println();
        for(int i = 0 ;i<result.length ;i++){
            System.out.print(result[i] + " ");
        }
    }
}
