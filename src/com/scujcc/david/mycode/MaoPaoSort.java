package com.scujcc.david.mycode;

/**
 * Created by David on 3/21/17.
 */

/**
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */

/*＊
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
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
        for (int i = 0; i < arr.length-1; i++){                 //外层循环9次
            for (int j = 0; j < arr.length-1-i; j++){           //内层循环9/8/.../1次
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
