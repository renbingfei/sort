package com.rbf.heap;

public class Heap {
	public int heapSize=0;
	public Heap(){
		
	}
	public void heapSort(int[] array){
		buildMaxHeap(array);
		heapSize=array.length-1;
		
		for(int i=array.length-1;i>0;i--){
			int temp=array[i];
			array[i]=array[0];
			array[0]=temp;
			
			heapSize -=1;
			maxHeapIFY(array, 0);
		}
	}
	
	public void buildMaxHeap(int[] array){
		heapSize=array.length-1;
		
		for(int i=(int) Math.floor(array.length/2);i>=0;i--){
			maxHeapIFY(array, i);
		}
	}
	
	public void maxHeapIFY(int[] array,int i){
		int l=2*i;
		int r=2*i+1;
		int largest=0;
		
		if(l<=heapSize && array[l]>array[i]){
			largest=l;
		}else{
			largest=i;
		}
		
		if(r<=heapSize && array[r]>array[largest]){
			largest=r;
		}
		
		if(largest!=i){
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			
			maxHeapIFY(array, largest);
		}
	}
	public static void main(String[] args){
		Heap heap=new Heap();
		int[] array=new int[]{16,14,10,8,7,9,3,2,4,1};
		heap.heapSort(array);
		
		for(int ele:array){
			System.out.println(ele);
		}
	}
}
