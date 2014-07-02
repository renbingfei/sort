package com.rbf.counting;

public class CountingSort {
	public CountingSort(){};
	
	public void sort(int[] orien,int k,int[] target){
		int[] c=new int[k];
		//初始化
		for(int i=0;i<k;i++){
			c[i]=0;
		}
		//计算orien每个元素的个数
		for(int i=0;i<orien.length;i++){
			c[orien[i]]=c[orien[i]]+1;
		}
		//计算小于元素i的个数，保存在c中
		for(int i=1;i<k;i++){
			c[i]=c[i]+c[i-1];
		}
		
		//将orien中的元素放入B中相应的位置中
		for(int i=orien.length-1;i>=0;i--){
			target[c[orien[i]]]=orien[i];
			c[orien[i]]=c[orien[i]]-1;
		}
	}
	
	public static void main(String[] args){
		int[] orien=new int[]{6,0,2,0,1,3,4,6,1,3,2};
		int[] target=new int[orien.length+1];
		new CountingSort().sort(orien, 7, target);
		
		for(int ele:target){
			System.out.println(ele);
		}
	}
}
