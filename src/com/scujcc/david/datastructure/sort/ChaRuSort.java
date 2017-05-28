package com.scujcc.david.datastructure.sort;

/**
 * Created by David on 3/22/17.
 */

/*
 * 插入排序－－简单插入排序
 *
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置中
 * 重复步骤2
 * @param numbers  待排序数组
 */

public class ChaRuSort {
    public ChaRuSort(){}

    public void sort(int[] arr){
        int temp = 0;
        int j = 0;

        //排序前的数据
        System.out.println("排序前的数据：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //开始排序
        for (int i = 0; i < arr.length; i++){
            temp = arr[i];
            for (j = i; j > 0 && temp < arr[j-1]; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }

        //排序后的数据
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ChaRuSort chaRuSort = new ChaRuSort();
        int[] arr = new int[]{5,3,2,4,1,6,8,7,10,9};

        chaRuSort.sort(arr);
    }
}
