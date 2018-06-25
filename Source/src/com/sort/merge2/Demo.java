package com.sort.merge2;

public class Demo {

	public static void main(String[] args) {

		int[] myArray= {1,6,8,7,4,3,2,5};
		mergeSort sorter = new mergeSort();
		
		sorter.sort(myArray);
		/*
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		*/
	}

}
