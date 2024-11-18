package com.mylearnings.programs;

import java.util.Arrays;

public class SortedArrayMerge {

    public static void main(String[] args) {
        int [] arr1 = {4,8,11,17,21,47};
        int [] arr2 = {1,4,7,11,17,19,25,28,47,49} ;
        int [] mergeArr = new int[arr1.length+ arr2.length];

        int i=0 , j=0 , k=0;

        while(i< arr1.length && j< arr2.length){
            if(arr1[i] <= arr2[j]) {
                mergeArr[k++] = arr1[i++];
            }else {
                mergeArr[k++] = arr2[j++];
            }
        }

        if(i < arr1.length){
            mergeArr[k++] = arr1[i++];
        }
        if(j < arr2.length){
            mergeArr[k++] = arr2[j++];
        }
        for (int nu: mergeArr){
            System.out.print(nu + " ");
        }
    }
}
