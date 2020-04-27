package practice;

public class LongestPeakCount {
	
	  public static int longestPeak(int[] array) {
		    // Write your code here.
				int n = array.length;
				int longest_peak_length = 0;
				if(n<3){
					return 0;
					
				}
				
				for(int i = 1 ; i <= n-2 ; i++){
					//to find the peak element
					if(array[i-1] < array[i] &&  array[i]>array[i+1]){
						int peak_Value = array[i];
						// to find the the longest peak
						int rightCount = 0;
						int leftCount = 0;
						int k = i;
						while(k >0){
							if(array[k-1]<array[k]) {
							++leftCount;
							k--;
							}else {
								break;
							}
						}
						int z=i;
						while(z < n-1){
							if(array[z]>array[z+1]) {
							++rightCount;
							z++;
							}else {
								break;
							}
						}
						
						int peakLength = rightCount+leftCount;
						
						if(peakLength > longest_peak_length){
							
							longest_peak_length = peakLength+1;
							
						}
						
					}
					
				}
		    return longest_peak_length;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
		System.out.println(longestPeak(arr));
	}

}
