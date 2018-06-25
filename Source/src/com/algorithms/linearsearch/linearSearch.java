package com.algorithms.linearsearch;

public class linearSearch {

	int[] a= {1,2,3,4,5};
	int x;
	public int search(int x) {
		int answer=-1;
		int index=0;
		while(index<a.length) {
			if(a[index]==x) {
				answer=index;
				break;
			}
			else {
				answer=-1;
			}
			index=index+1;

		}
		return answer;
	}
}
