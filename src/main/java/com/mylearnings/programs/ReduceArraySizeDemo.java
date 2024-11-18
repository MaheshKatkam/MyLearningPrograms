package com.mylearnings.programs;

import java.util.Arrays;

public class ReduceArraySizeDemo {

    public static void main(String[] args) {

        int [] arr = {10,30,20,40,23,45,99,1,2};
        int [] newArr = new int[0];
        while (arr.length>=2){
            System.out.println(arr[0] + arr[1]);
             newArr = new int[arr.length-1];
             newArr[0] = arr[0] + arr[1];
             int index = 1;
             if(arr.length ==1){
                 newArr[index] = arr[0];
             }
            for(int j = 2 ; j< arr.length ; j++){
                newArr[index] = arr[j];
                index++;
            }
            if(newArr.length>1){
                arr = new int[newArr.length];
                for(int k = 0 ; k < newArr.length ; k ++){
                    arr[k] = newArr[k];
                }
            }
            if(newArr.length ==1){
               break;
            }
        }
        System.out.println("Reduce Array size : "+ Arrays.toString(newArr));

    }
}
