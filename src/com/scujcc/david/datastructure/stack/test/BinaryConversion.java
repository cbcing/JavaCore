package com.scujcc.david.datastructure.stack.test;

import com.scujcc.david.datastructure.stack.SeqStack;

/**
 * Created by David on 5/28/17.
 */

/*
 * 使用栈实现进制的转换。
 */

public class BinaryConversion {
	public BinaryConversion(){}

	public String binaryConversion(int number){
		String result = "";
		SeqStack<Integer> seqStack = new SeqStack<Integer>(1);

		if (number == 0)
			return "0";

		while (number != 0) {
			seqStack.push(number % 2);
			number /= 2;
		}

		while (!seqStack.isEmpty()) {
			result = result + seqStack.pop().toString();
		}

		return result;
	}

	public static void main(String[] args) {
		BinaryConversion binaryConversion = new BinaryConversion();
		int x = 16;
		System.out.println(binaryConversion.binaryConversion(x));
	}
}
