package com.scujcc.david.datastructure.stack;

/**
 * Created by David on 5/28/17.
 */
public interface Stack<T> {
	boolean isEmpty();	//判空

	void push(T x); //x入栈

	T pop(); //出栈

	T get(); //取栈顶元素
}
