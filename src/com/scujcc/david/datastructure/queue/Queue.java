package com.scujcc.david.datastructure.queue;

/**
 * Created by David on 5/28/17.
 */
public interface Queue<T> {
	boolean isEmpty();// 判断队列是否空

	void enquenu(T x);// 元素x入队

	T dequeue();// 出队,返回对头元素
}
