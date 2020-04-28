package LeastCommonSubSequence;

public class LCSRecursive {
	
	static int lcsRecursive(String[] x,String[] y,int m, int n) {
		
		// base condition
		if(n==0 || m==0) {
			return 0;
		}
		
		//choice diagram
		if(x[m-1] == y[n-1]) {
			return lcsRecursive(x,y,m-1,n-1)+1;
		}else {
			return Math.max(lcsRecursive(x, y, m-1, n), lcsRecursive(x, y, m, n-1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = {"a","s","d","f","p"};
		int m = x.length;
		String[] y = {"a","s","e","r","t","p"};
		int n = y.length;
		System.out.println(lcsRecursive(x, y, m, n));

	}

}
