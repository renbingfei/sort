package dynamic;

public class Dynamic {
	public Dynamic(){
		
	}
	
	/**
	 * 
	 * @param a:每个站点所花费时间
	 * @param t:装配线转换所化费时间
	 * @param x:从装配线出来所花费时间
	 * @param e:进入装配线所花费时间
	 * @param n:站点数
	 * @return total:返回最短耗时
	 */
	public int quickestWay(int[][] a,int[][]t,int[] x,int[] e,int n){
		int total=0;
		int[] f1=new int[n];
		int[] f2=new int[n];
		int[] l1=new int[n];
		int[] l2=new int[n];
		l1[0] = 1;
		l2[0] = 2;
		
		f1[0]=a[0][0] + e[0];    //1装配线上的第一个站点
		f2[0]=a[1][0] + e[1];    //2装配线上的第一个站点
		
		for(int i=1;i<n;i++){
			if((f1[i-1] + a[0][i])<=(f2[i-1]+t[1][i-1]+a[0][i])){
				f1[i] = f1[i-1] + a[0][i];
				l1[i] = 1;
			}else{
				f1[i] = f2[i-1] + t[1][i-1] + a[0][i];
				l1[i] = 2;
			}
			
			if(f2[i-1] + a[1][i] <= f1[i-1] + t[0][i-1] + a[1][i]){
				f2[i] = f2[i-1] + a[1][i];		
				l2[i] = 2;
			}else{
				f2[i] = f1[i-1] + t[0][i-1] + a[1][i];
				l2[i] = 1;
			}
		}
		
		int temp = 0;
		if(f1[n-1] + x[0] <= f2[n-1] + x[1]){
			total = f1[n-1] + x[0];
			temp = 1;
		}else{
			total = f2[n-1] + x[1];
			temp = 1;
		}
		int ele = temp;
		System.out.println("line "+ele+"-->station"+n);
		for(int j = n; j>1;j--){
			if(ele==1){
				ele = l1[j-1];
			}else{
				ele = l2[j-1];
			}
			
			System.out.println("line "+ele+"-->station"+(j-1));
		}
		return total;
	}
	
	public static void main(String[] args){
		int[][] a=new int[][]{{7,9,3,4,8,4},{8,5,6,4,5,7}};
		int[][] t=new int[][]{{2,3,1,3,4},{2,1,2,2,1}};
		int[] e=new int[]{2,4};
		int[] x=new int[]{3,2};
		int n=6;
		int result=new Dynamic().quickestWay(a, t, x, e, n);
		System.out.println("the min time is: "+result);
	}
}
