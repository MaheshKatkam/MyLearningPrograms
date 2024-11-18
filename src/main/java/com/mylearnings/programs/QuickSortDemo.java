package com.mylearnings.programs;

public class QuickSortDemo {

    public static void main(String[] args) {
        int arr[] = {9,2,11,4,3,21,14,19,8,6,5,1};
        quickSort(arr,0,arr.length-1);
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
    public static void quickSort(int[] arr,int lowIndex , int highIndex){
        if (lowIndex < highIndex) {
            int pi =  partition(arr,lowIndex,highIndex);
            quickSort(arr,lowIndex,pi-1);
            quickSort(arr,pi+1,highIndex);
        }

    }
    private static int partition(int[] arr,int lowIndex , int highIndex) {
        int pivot = arr[lowIndex];
        int lp = lowIndex +1;
        int rp = highIndex;
        while (lp <= rp){
            while (lp <= rp  && arr[lp] < pivot){
                lp++;
            }
            while (lp <= rp &&  arr[rp] > pivot){
                rp--;
            }
            if (lp <= rp) {
                swap(arr, lp, rp);
                lp++;
                rp--;
            }
        }
        swap(arr,rp,lowIndex);
        return rp;
    }

    private static void swap(int arr[], int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
