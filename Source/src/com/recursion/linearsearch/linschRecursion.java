package com.recursion.linearsearch;

public class linschRecursion {
static int c;
	public static void main(String[] args) {

		c=linearSearch(new int[] {1,2,3,4,5,6},0,5 );
        System.out.println("Found at "+c);
	}

	public static int linearSearch(int[] a,int i,int x) {
		if(i>a.length-1) {return -1;}
		else if(a[i]==x) {return i;}
		else return linearSearch(a,i+1,x);
		}
}
