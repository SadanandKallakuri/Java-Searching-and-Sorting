package com.sort.selection;

public class selectionSort {

	public static void main(String[] args) {
		int [] myArray=selectSort(new int [] {1,3,2,54,4,8,60});
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static int[] selectSort(int [] a) {
		int min;
		for(int i=0;i<a.length;i++) {
			min=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
					a[j]=a[i];
					a[i]=min;
				}
			}
				
		}
		return (a);
	}

}
