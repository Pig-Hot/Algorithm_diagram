package com.springboot.oneforall.arithmetic;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length - 1;i++){
            for (int j=0;j<array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,7,1,3,9};
        bubbleSort(array);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
