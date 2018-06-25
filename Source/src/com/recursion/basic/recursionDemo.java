package com.recursion.basic;

public class recursionDemo {

	public static void main(String[] args) {

		reduceByOne(2);
	}
	public static void reduceByOne(int n) {
		if(n>=0) reduceByOne(n-1);

		System.out.println("Completed call "+n);
	}
}
