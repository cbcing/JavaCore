package com.scujcc.david.datastructure.list.test;

import com.scujcc.david.datastructure.list.SingleLinkedList;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by David on 5/28/17.
 */

/*
 * 链表的倒置。
 */
public class Reverse {
	public static void main(String[] args) {
		int[] data = new int[]{2,3,4,5,6};
		SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<Integer>();
		SingleLinkedList<Integer> newSingleLinkedList = new SingleLinkedList<Integer>();

		for (int i = 0; i < data.length; i++) {
			singleLinkedList.append(data[i]);
		}
		System.out.println();

		for (int i = 1; i <= data.length; i++)
			System.out.print(singleLinkedList.get(i) + " ");

		for (int i = data.length; i >= 1; i--)
			newSingleLinkedList.append(singleLinkedList.get(i + 1));

		System.out.println();

		for (int i = 1; i <= data.length; i++)
			System.out.print(newSingleLinkedList.get(i) + " ");
	}
}
