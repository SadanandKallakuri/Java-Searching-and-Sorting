package com.algorithms.linearsearch1;

public class linearSearch {
	static int[] a= {1,2,3,4,5};
	int x;
	static int b;
	public static void main(String[] args) {
        b= search(a,4);
        System.out.println("Found at "+b);
         
         
	}
	/* (slower code)
	public static int search(int[] a,int x) {
		int index;
		int answer=-1;
		for(index=0;index<a.length;index++) {
			if(a[index]==x) {
			answer=index;
		}
		}
		return answer;
	}
	*/
	public static int search(int[] a,int x) {
		int index;
		for(index=0;index<a.length;index++) {
			if(a[index]==x) {
			return index;
		}
		}
		return -1;
	}
	
}
