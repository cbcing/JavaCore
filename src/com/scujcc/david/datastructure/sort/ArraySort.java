package com.scujcc.david.datastructure.sort;

/**
 * Created by David on 5/28/17.
 */

/*
 * Array Sort.
 */
public class ArraySort {

    //插入排序－－直接插入排序。
    //基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {  // n-1
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }

    //插入排序－－shell排序。
    //基本思想：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
    public static void shellSort(int[] array) {
        int j, temp;
        for (int increment = array.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < array.length; i++) {
                temp = array[i];
                for (j = i; j >= increment; j -= increment) {
                    if (temp < array[j - increment])
                        array[j] = array[j - increment];
                    else
                        break;
                }
                array[j] = temp;
            }
        }
    }

    //交换排序－－冒泡排序。
    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //交换排序－－快速排序。
    public static void quickSort(int[] array) {
        if (array.length > 0){
            quickSort(array, 0, array.length-1);
        }
    }
    //获取中轴位置
    private static int getMiddle(int[] array, int low, int high){
        int temp = array[low];

        while (low < high){
            while (low < high && array[high] > temp){
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] < temp){
                low++;
            }
            array[high] = array[low];
        }

        array[low] = temp;

        return low;
    }
    //递归
    private static void quickSort(int[] array, int low, int high){
        if (low < high){
            int middle = getMiddle(array, low, high);
            quickSort(array, low, middle-1);
            quickSort(array, middle+1, high);
        }
    }

    //display.
    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    //选择排序－－简单选择排序。
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {// n-1趟排序
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    //选择排序－－堆排序。
    public static void heapSort(int[] table) {
        int n = table.length;
        // 创建最小堆
        for (int j = n / 2 - 1; j >= 0; j--)
            sift(table, j, n - 1);
        for (int j = n - 1; j > 0; j--) {// 每趟将最小堆交换到后面，再调整成堆
            int temp = table[0];
            table[0] = table[j];
            table[j] = temp;
            sift(table, 0, j - 1);
        }
    }

    // 将以begin为跟的子树调整成最小堆，begin，end是序列下界和上界
    private static void sift(int[] table, int begin, int end) {
        int i = begin, j = 2 * i + 1;// i为子树的跟，j为i结点的跟
        int temp = table[i];// 获得第i个元素的值

        while (j <= end) {// 沿较小值孩子结点向下筛选
            if (j < end && table[j] < table[j + 1])// 数组元素比较
                j++;
            if (temp > table[j]) {// 若父母结点较大
                table[i] = table[j];// 孩子结点中的较小值上移
                i = j;// i，j向下一层
                j = 2 * i + 1;
            } else
                break;
        }
        table[i] = temp;// 当前子树的原跟值调整后的位置
    }

    // 归并排序
    /*
     * 基本思想：归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，
     * 每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
     */
    public static void mergeSort(int[] X) {
        int[] Y = new int[X.length];// Y数组长度同X数组
        int n = 1;// 已排序的子序列长度，初值为1
        while (n < X.length) {
            mergepass(X, Y, n);// 一趟排序，将X数组中各子序列归并到Y中
            n *= 2;// 子序列长度加倍
            if (n < X.length) {
                mergepass(Y, X, n);// 将Y数组个子序列再归并到X中
                n *= 2;
            }
        }
    }

    // 一次归并
    private static void merge(int[] X, int[] Y, int m, int r, int n) { // 一次归并
        int i = m, j = r, k = m;

        while (i < r && j < r + n && j < X.length)
            // 将X中两个相邻子序列归并到Y中
            if (X[i] < X[j])// 较小值复制到Y中
                Y[k++] = X[i++];
            else
                Y[k++] = X[j++];
        // 将前一个子序列剩余元素复制到Y中
        while (i < r)
            Y[k++] = X[i++];
        while (j < r + n && j < X.length)
            // 将后一个子序列剩余元素复制到Y中
            Y[k++] = X[j++];
    }

    // 一趟归并
    private static void mergepass(int[] X, int[] Y, int n) {
        int i = 0;
        while (i < X.length - 2 * n + 1) {
            merge(X, Y, i, i + n, n);
            i += 2 * n;
        }
        if (i + n < X.length)
            merge(X, Y, i, i + n, n);// 再一次归并
        else
            for (int j = i; j < X.length; j++)
                // 将X剩余元素复制到Y中
                Y[j] = X[j];
    }

    public static void main(String[] args) {
        //test
        int[] testArray = new int[]{3,4,6,2,1,10,9,8,7,5};
        display(testArray);
        ArraySort.mergeSort(testArray);
        display(testArray);
    }
}
