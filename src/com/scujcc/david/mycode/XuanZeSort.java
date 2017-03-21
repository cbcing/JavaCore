package com.scujcc.david.mycode;

/**
 * Created by David on 3/21/17.
 */

/*
 * 选择排序－－简单选择排序
 *
 * 基本思想：选择最小的数与第一位置的数进行交换，然后在剩下的数字中选择最小的数字与第二个数进行交换，
 *          如此循环到倒数第二个数和最后一个数比较为止！
 */

public class XuanZeSort {
    public void xuanzeSort(int[] arr){
        int temp;

        //开始排序
        for (int i = 0; i < arr.length; i++){
            int k = i;
            for (int j = i; j < arr.length; j++){       //内圈循环
                if (arr[j] < arr[k]){
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,6,3,1,5,8,7,10,9};
        XuanZeSort xuanZeSort = new XuanZeSort();

        //排序前的数据
        System.out.println("排序前的数据:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        //开始排序
        xuanZeSort.xuanzeSort(arr);

        //排序后的数据
        System.out.println("排序后的数据:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
