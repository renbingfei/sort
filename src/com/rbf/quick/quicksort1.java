package com.rbf.quick;

import java.util.Random;

class quicksort1
{
	public int data[];
	
	public void sort(int low,int height){
		if(low<height){
			int result=partition(data,low,height);
			sort(low,result-1);
			sort(result+1,height);
		}
	}
	
	private int partition(int[] array,int low,int height){
		Random rand=new Random();
		int t=low+(int)(Math.random()*(height-low+1));
		int key=array[t];
		array[t]=array[low];
		array[low]=key;
		while(low<height){
			while(low<height && array[height]>=key){
				height--;
			}
			array[low]=array[height];
			
			while(low<height &&array[low]<=key){
				low++;
			}
			array[height]=array[low];
		}
		array[low]=key;
		return low;
	}
	
	public void display()
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]);
			System.out.print(" ");
		}
	}
}