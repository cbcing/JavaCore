package com.scujcc.david.datastructure.list.test;

import com.scujcc.david.datastructure.list.SingleLinkedList;

/**
 * Created by David on 5/29/17.
 */

/*
 * 合并两个有序单链表。
 */
public class Merge {
	public static void main(String[] args) {
		int[] data1 = new int[]{1, 3, 5, 7, 9};
		int[] data2 = new int[]{2, 4, 6, 8, 10};
		SingleLinkedList<Integer> singleLinkedList1 = new SingleLinkedList<>();
		SingleLinkedList<Integer> singleLinkedList2 = new SingleLinkedList<>();
		SingleLinkedList<Integer> singleLinkedList3 = new SingleLinkedList<>();

		for (int i = 0; i < data1.length; i++)
			singleLinkedList1.append(data1[i]);

		for (int i = 0; i < data2.length; i++)
			singleLinkedList2.append(data2[i]);


	}
}
