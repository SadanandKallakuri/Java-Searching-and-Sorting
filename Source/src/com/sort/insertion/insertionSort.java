package com.sort.insertion;

public class insertionSort {

	public static void main(String[] args) {
		int [] myArray=insertSort(new int [] {1,3,2,6,4,8,5,7});
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
	}
	}
	public static int[] insertSort(int [] a) {
		for(int i=1;i<a.length;i++) {
			int element=a[i];
			int j=i-1;
			while(j>=0 && a[j]>element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=element;
		}
		return (a);
	}
 
}
