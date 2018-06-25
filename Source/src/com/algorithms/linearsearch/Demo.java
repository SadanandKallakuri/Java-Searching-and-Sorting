package com.algorithms.linearsearch;

public class Demo {

	public static void main(String[] args) {
		int display1;
		int display2;
		int display3;
		int display4;
		linearSearch searchList=new linearSearch();
		display4=searchList.search(1);
		System.out.println("1 found at "+display4);
		display1=searchList.search(3);
		System.out.println("3 found at "+display1);
		display2=searchList.search(5);
		System.out.println("5 found at "+display2);
		display3=searchList.search(8);
		System.out.println("8 found at "+display3);

	}

}
