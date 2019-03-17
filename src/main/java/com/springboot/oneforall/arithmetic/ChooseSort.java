package com.springboot.oneforall.arithmetic;

public class ChooseSort {

    private static void chooseSort(int[] array){
        for (int i=0;i<array.length - 1;i++){
            int min = i;
            for(int j=i+1;j<array.length - 1;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,7,1,3,9};
        chooseSort(array);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
