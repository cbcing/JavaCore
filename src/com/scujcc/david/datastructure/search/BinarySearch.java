package com.scujcc.david.datastructure.search;

/**
 * Created by David on 5/28/17.
 */

/*
 * 二分法查找（折半查找）。
 */

/*
 * 基本思想：二分搜索（英语：binary search），也称折半搜索（英语：half-interval search）、对数搜索（英语：logarithmic search），
 * 是一种在有序数组中查找某一特定元素的搜索算法。 搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；
 * 如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的 那一半中查找，而且跟开始一样从中间元素开始比较。
 * 如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。
 */

public class BinarySearch {

	//递归实现。
	public static int binarySearch1(int[] array, int low, int high, int target) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] < target)	//中间值比目标值小，则在右半边查找。
				return binarySearch1(array, mid + 1, high, target);
			else if (array[mid] > target)	//中间值比目标值大，则在左半边查找。
				return binarySearch1(array, low, mid - 1, target);
			else
				return mid;
		}
		return -1;
	}

	//非递归方法实现。
	public static int binarySearch2(int[] array, int low, int high, int target) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] < target)
				low = mid + 1;
			else if (array[mid] > target)
				high = mid - 1;
			else
				return mid;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] data = {1, 5, 6, 12, 15, 19, 23, 26, 30, 33, 37, 42, 53, 60};
		int target = 42;
		int index = binarySearch1(data, 0, data.length - 1, target);
		int index2 = binarySearch2(data, 0, data.length, target);
		if (index > -1)
			System.out.println("(binarySearch1)success: " + index);
		else
			System.out.println("(binarySearch1)sorry, target not found!");
		if (index2 > -1)
			System.out.println("(binarySearch2)success too: " + index);
		else
			System.out.println("(binarySearch2)sorry, target not found!");
	}

}
