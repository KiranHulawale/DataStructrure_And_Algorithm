package com.bridgelabz;

public class MergeSort {
    public int[] mergeSort(int [] array, int start, int end) {
        if(end - start < 1) {
            return array;
        }

        int mid = (end + start) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        return merge(array, start, mid, end);
    }

    
}
