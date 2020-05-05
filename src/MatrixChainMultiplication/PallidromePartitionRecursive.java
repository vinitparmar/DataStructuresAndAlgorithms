package MatrixChainMultiplication;

public class PallidromePartitionRecursive {
	
	static int solve(String str , int i , int j) {
		
		if(i >= j) {
			return 0;
		}
		
		if(isPallidrome(str)) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int k = i; k <= j-1; k++) {
			
			int temp =  solve(str, i, k)+
						solve(str, k+1, j)+
						1;
			min = Math.min(temp, min);
			
		}
		return min;
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
		int i = 0;
		int j = str.length()-1;
		
		System.out.println(solve(str, i, j));

	}

}
