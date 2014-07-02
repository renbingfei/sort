package com.rbf.buddle;

public class BuddleSort {
	private int[] seq;
	private int len;
	
	public BuddleSort(){};
	public BuddleSort(int[] a,int len){
		seq=a;
		this.len=len;
		
	}
	
	public int[] sort(){
		
		int i,j,temp;
		for(j=0;j<len-1;j++){
			for(i=0;i<len-1-j;i++){
				if(seq[i]>seq[i+1]){
					temp=seq[i];
					seq[i]=seq[i+1];
					seq[i+1]=temp;
				}
			}
		}
		
		return seq;
	}
	
	public static void main(String[] args){
		int[] sequence={9,8,7,6,5,2,7,1};
		BuddleSort buddle=new BuddleSort(sequence, sequence.length);
		sequence=buddle.sort();
		for(int t=0;t<sequence.length;t++){
			System.out.println("a["+t+"]: "+sequence[t]+"\t");
		}
	}
}
