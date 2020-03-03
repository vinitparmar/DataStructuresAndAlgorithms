package dynamicprogramming;

public class BuyAndSellStock {

	static int maxProfit(int[] arr, int n) {
		
		int maxVal = arr[0];
		int minVal = arr[0];
		for(int i=0;i<n-1;i++) {
			for( int j=i+1;j<n;j++) {
				if(arr[i]<arr[j] && minVal >= arr[i]) {
					minVal = arr[i];
				}
				
				if(arr[i] < arr[j] && maxVal <= arr[j] ) {
					maxVal = arr[j];
				}
			}
		}
		
		
		return maxVal - minVal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
