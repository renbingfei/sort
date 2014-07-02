package com.rbf.select;

/*
 * @doc:该类主要用于测试选择排序
 */
public class Select {
	private int[] orien;
	/*
	 * 构造函数
	 */
	public Select(){
		orien=new int[]{};
	}
	/*
	 * @parmas:int[] array,int[] orien
	 */
	public Select(int[] orien){
		this.orien=orien;
	}

	

	public void sort(){
		int minIndex;
		for(int i=0;i<orien.length;i++){
			minIndex=i;
			int temp=0;
			for(int j=i+1;j<orien.length;j++){
				if(orien[j]<orien[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex!=i){
				temp=orien[i];
				orien[i]=orien[minIndex];
				orien[minIndex]=temp;
			}
		}
	}
	
	public static void main(String[] args){
		Select select=new Select(new int[]{3,2,5,1,89,12});
		select.sort();
		for(int ele:select.orien){
			System.out.println(ele);
		}
	}
}
