package com.sort.merge2;

public class mergeSort {

	public void sort(int myArray[]) {
		sort(myArray,0,myArray.length-1);
	}
	public static void sort(int myArray[],int start, int end) {
		if(end<=start) {
			return;
		}
		int mid=(start+end)/2;
		sort(myArray,start,mid);
		sort(myArray,mid+1,end);
		merge(myArray,0,mid,end);
	}
	public static void merge(int myArray[],int start,int mid,int end) {
		int tempArray[]= new int[end-start +1];
		int[] L;
		int[] R;
		int leftSlot=start;
		int rightSlot=mid+1;
		int endSlot=end+1;
		int leftCount=mid-start+1;
		int rightCount=end-mid;
		L=new int[leftCount+1];
		R= new int[rightCount+1];
		for(int i=0;i<rightCount;i++) {
			L[i]=myArray[i];
		}
		System.out.println("L");
		for(int i=0;i<L.length;i++) {
			System.out.println(L[i]);
		}
		for(int j=0;j<rightCount;j++) {
			R[j]=myArray[rightSlot+j];
		}
		System.out.println("R");
		for(int i=0;i<R.length;i++) {
			System.out.println(R[i]);
		}
		L[leftCount]= 9999999;
		R[rightCount]=9999999;
		
		int i=0;
		int j=0;
		for(int k=leftSlot;k<endSlot;k++) {
			if(L[i]<R[j]) {
				tempArray[k]=L[i];
				i=i+1;
			}
			else {
				tempArray[k]=R[j];
				j=j+1;
			}
			
		}		
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<rightCount&&j<leftCount) {
//			if(L[i]<R[j]) {
//				tempArray[k]=L[i];
//				i=i+1;
//			}
//			else {
//				tempArray[k]=R[j];
//				j=j+1;
//			}
//			k=k+1;
//		}	
//		
		System.out.println("////////");
		for(i=0;i<tempArray.length;i++) {
			System.out.println(tempArray[i]);
		}
//		for(i=0;i<end;i++) {
//			myArray[i]=tempArray[i];
//		}
//		
		
	}
}
