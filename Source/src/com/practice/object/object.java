package com.practice.object;

import java.util.ArrayList;

public class object {
public static ArrayList<Integer> list;

	public static void main(String[] args) {
		list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(100);
		Object[] sample=ex();
		for(Object val:sample) {
			System.out.println("obj is "+val);
		}
		

	}
public static Object[] ex() {
	return list.toArray();

}
}
