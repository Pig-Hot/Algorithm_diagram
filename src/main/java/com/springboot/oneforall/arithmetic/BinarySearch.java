package com.springboot.oneforall.arithmetic;

public class BinarySearch {
    public static void binarySearch(int[] array,int i){
        int base = 0;
        int end = array.length - 1;
        int mid = (base + end)/2;
        while (base < end) {
            if (i > array[mid]) {
                base = mid;
                mid = (base + end) / 2;
            } else if (i < array[mid]) {
                end = mid;
                mid = (base + end) / 2;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,3,4,7,9,11,13,15,17,19};
        binarySearch(array,3);
    }
}
