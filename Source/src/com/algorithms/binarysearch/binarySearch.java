package com.algorithms.binarysearch;

public class binarySearch {
	static int[] a= {1,2,3,4,5};
	int x;
	static int b,c;
	public static void main(String[] args) {
        b= search(a,6);
        System.out.println("Found at "+b);
         c=search(new int[] {1,2,3,4,5,6},9);
         System.out.println("Found at "+c);

	}
	public static int search(int[] a,int x) {
		int p=0;
		int r=a.length-1;
		int q;
		while(p<=r) {
			q=(p+r)/2;
			if(a[q]==x) {
				return q;
			}
			else if(a[q]>x) {
				r=q-1;
			}
			else {
				p=q+1;
			}
		}
		return -1;
	}
}
