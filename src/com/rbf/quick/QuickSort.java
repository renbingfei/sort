package com.rbf.quick;



public class QuickSort 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO 自动生成方法存根
		quicksort1 qs = new quicksort1();
		int data[] = {44,22,2,32,54,22,88,77,99,11};
		qs.data = data;
		qs.sort(0, qs.data.length-1);
		qs.display();
	}

}


