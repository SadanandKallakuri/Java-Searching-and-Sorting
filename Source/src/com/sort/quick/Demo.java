package com.sort.quick;
import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {

		int[] myArray= {1,6,8,7,4,3,2,5};
		System.out.println(Arrays.toString(myArray));
		
		sort(myArray,0,myArray.length-1);
		System.out.println(Arrays.toString(myArray));
	}

	public static void sort(int[] myArray,int start, int end) {
		if(start<end) {
		int genpivot=partition(myArray,start,end);
		sort(myArray,start,genpivot-1);
		sort(myArray,genpivot+1,end);	
		}
		
	}
	public static int partition(int myArray[],int start, int end) {
		int pivot=myArray[end];
		int j=start;
		int i=j-1;
		while(j<end) {
			if(myArray[j]<=pivot) {
				i++;
				int p=myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=p;	
			}
			j++;
		}
		i++;
		int p=myArray[i];
		myArray[i]=pivot;
		myArray[end]=p;	
		
		return i;
	}
}
