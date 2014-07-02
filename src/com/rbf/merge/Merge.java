package com.rbf.merge;

public class  Merge
{
    //递归分成小部分
    public static void mergeSort(int[] arrays,int start,int end){
    	if(start<end){
    		int m=(end+start)/2;
    		mergeSort(arrays,start,m);
    		mergeSort(arrays,m+1,end);
    		merge(arrays,start,m,end);
    	}
    }
    
    public static void merge(int[] arrays,int start,int m,int end){
    	int i=start;
    	int j=m+1;
    	int c=0;
    	int[] temp=new int[arrays.length];
    	while(i<=m&&j<=end){
    		if(arrays[i]<arrays[j]){
    			temp[c]=arrays[i];
    			c++;
    			i++;
    		}else{
    			temp[c]=arrays[j];
    			j++;
    			c++;
    		}
    	}
    	while(i<=m){
    		temp[c]=arrays[i];
    		i++;
    		c++;
    	}
    	
    	while(j<=end){
    		temp[c]=arrays[j];
    		j++;
    		c++;
    	}
    	c=0;
    	
    	for(int t=start;t<=end;t++,c++){
    		arrays[t]=temp[c];
    	}
    	
    	snap(arrays);
    }
    
    public static void snap(int[] arrays){
    	for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
            System.out.println();
    }
    
    public static void main(String[] args) 
    {
        Merge m=new Merge();
        int a[]={7,10,5,8,4,9};
        m.mergeSort(a,0,a.length-1);
        
    }
}