package com.scujcc.david.mycode;

/**
 * Created by David on 3/21/17.
 */
public class MaoPaoSort {
    public void sort(int[] arr){

        //排序前的数据
        System.out.println("排序前的数据:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //开始冒泡排序
        int temp;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();

        //排序后的数据
        System.out.println("排序后的数据:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaoPaoSort maoPaoSort = new MaoPaoSort();
        int[] arr = new int[]{3,2,1,5,4,7,6,9,10,8};
        maoPaoSort.sort(arr);
    }
}
