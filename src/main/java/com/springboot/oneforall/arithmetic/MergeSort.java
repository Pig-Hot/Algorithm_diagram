package com.springboot.oneforall.arithmetic;

public class MergeSort {
    public static int[] mergeSort(int[] array,int left,int right){
        if(left == right){
            return new int[]{ array[left] };
        }
        int mid = (left + right) / 2;
        int[] l = mergeSort(array,left,mid);
        int[] r = mergeSort(array,mid + 1,right);
        return megre(l,r);
    }

    private static int[] megre(int[] l, int[] r) {
        int[] result = new int[l.length + r.length];
        int p = 0;
        int lp = 0;
        int rp = 0;
        while (lp < l.length && rp < r.length){
            result[p++] = l[lp] < r[rp] ? l[lp++] : r[rp++];
        }while (lp < l.length){
            result[p++] = l[lp++];
        }while (rp < r.length){
            result[p++] = r[rp++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,7,1,3,9};
        array = mergeSort(array,0,6);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
