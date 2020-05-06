package MatrixChainMultiplication;

public class PallidromePartitionRecursive {
	
	public static  int solve(String x){
		if(x=="" || isPallidrome(x)){
//			System.out.println(x);
			return 0;
		}else{
			int cuts = Integer.MAX_VALUE;
			for (int i = 1; i <x.length() ; i++) {
				cuts  = Math.min(1+ solve(x.substring(0, i)) + solve(x.substring(i, x.length())),cuts);
			}
			return cuts;
		}
	}
	static boolean isPallidrome(String str) {
		
		int leftIndex = 0;
		int rightIndex = str.length()-1;
		
		while(leftIndex <= rightIndex) {
			if(str.charAt(leftIndex) != str.charAt(rightIndex)) {
				return false;
			}
			leftIndex++;
			rightIndex--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vinit";
		System.out.println(solve(str));

	}

}
