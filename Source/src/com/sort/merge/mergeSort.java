package com.sort.merge;


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
		merge(myArray,start,mid,end);
	}
	public static void merge(int myArray[],int start,int mid,int end) {	
		int tempArray[]= new int[end-start +1];
		int leftSlot=start;
		int rightSlot=mid+1;
		int endSlot=end;
		int leftCount=mid-start+1;
		int rightCount=end-mid;
		int i=0;
		int j=0;
		int k=0;
		while(leftSlot<=mid&&rightSlot<=end) {
			if(myArray[leftSlot]<myArray[rightSlot]) {
				tempArray[k]=myArray[leftSlot];
				leftSlot++;
			}
			else {
				tempArray[k]=myArray[rightSlot];
				rightSlot++;
				}
			k++;
			
		}	
		if(leftSlot<=mid) {
			while(leftSlot<=mid) {
				tempArray[k]=myArray[leftSlot];
				leftSlot++;
				k++;
			}
		}else if(rightSlot<=end){
			while(rightSlot<=end) {
			tempArray[k]=myArray[rightSlot];
			rightSlot++;
			k++;
			}
		}
	
		for(i=0;i<tempArray.length;i++) {
            myArray[start+i] = tempArray[i];
		}
	
		
	}
}
