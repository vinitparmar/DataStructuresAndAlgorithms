package dynamicprogramming;

public class MaxLengthChain {
	int a;
	int b;
	
	public MaxLengthChain(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	static int maxlength(MaxLengthChain[] arr , int n) {
		int i,j,max=0;
		int[] mcl = new int[n];
		
		for(i=0;i<n;i++) {
			mcl[i]=1;
		}
		
		for(i=1;i<n;i++) {
			for(j=0;j<i;j++) {
				if(arr[i].a >arr[j].b && mcl[i] < mcl[j]+1) {
					mcl[i] = mcl[j] + 1;
				}
			}
		}
		
		for(i=0 ;i<n;i++) {
			if(max<mcl[i]) {
				max = mcl[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
