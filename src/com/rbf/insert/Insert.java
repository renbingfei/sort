package com.rbf.insert;

public class Insert {
	private int[] array;
	
	public Insert(){
		array=new int[]{};
	}
	public Insert(int[] array){
		this.array=array;
	}
	
	public void sort(){
		for(int j=0;j<array.length;j++){
			int temp=array[j];
			int i=j-1;
			while(i>-1 && array[i]>temp){
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=temp;
		}
	}
	
	public static void main(String[] args){
		Insert insert=new Insert(new int[]{3,2,4,5,1,52,32});
		insert.sort();
		for(int ele : insert.array){
			System.out.println(ele);
		}
	}
}
