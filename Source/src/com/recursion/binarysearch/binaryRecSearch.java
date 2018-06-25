package com.recursion.binarysearch;

public class binaryRecSearch {
static int c;
	public static void main(String[] args) {

		c=binRecSearch(new int[] {1,2,3,4,5,6},0,5,99);
        System.out.println("Found at "+c);

	}
	
	public static int binRecSearch(int[] a,int p,int r,int x) {
		int q;
		//int r=a.length-1;
		if(p>r) {return -1;}
		else {
			q=(p+r)/2;
			if(a[q]==x) {
				return q;
			}
			else if(a[q]>x) {
				return binRecSearch(a,p,q-1,x);
			}
			else {
				return binRecSearch(a,q+1,r,x);
			}
		}
	}

}
