package com.scujcc.david.mycode;

/**
 * Created by David on 3/21/17.
 */
public class KuaiSuSort {

    public KuaiSuSort(){}

    //获取中轴位置
    public int getMiddle(int[] arr, int low, int high){
        int temp = arr[low];

        while (low < high){
            while (low < high && arr[high] > temp){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] < temp){
                low++;
            }
            arr[high] = arr[low];
        }

        arr[low] = temp;

        return low;
    }

    //递归
    public void sort(int[] arr, int low, int high){
        if (low < high){
            int middle = this.getMiddle(arr, low, high);
            sort(arr, low, middle-1);
            sort(arr, middle+1, high);
        }
    }

    //排序入口
    public void kuaiSuSort(int[] arr){
        if (arr.length > 0){
            sort(arr, 0, arr.length-1);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        KuaiSuSort kuaiSuSort = new KuaiSuSort();
        int[] arr = new int[]{5,3,2,6,1,8,9,10,4,7};

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        kuaiSuSort.kuaiSuSort(arr);
    }
}
