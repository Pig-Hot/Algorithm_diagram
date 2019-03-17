package com.springboot.oneforall.arithmetic;

public class QuickSort {
    private static void quickSort(int[] array, int start, int end){
        if(start < end) {
            int base = array[start];
            int i = start;
            int j = end;
            int mid;
            while (i < j) {
                while (array[j] > base) {
                    j--;
                }
                while (array[i] < base) {
                    i++;
                }
                mid = array[i];
                array[i] = array[j];
                array[j] = mid;
            }
            quickSort(array, start, i - 1);
            quickSort(array, i + 1, j);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,7,1,3,9};
        quickSort(array,0,6);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
