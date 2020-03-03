package arrays;

public class FibonacciSeries {
	
	public void fibonacci(int range) {
		int t1, t2,sum;
		t1 = 1;
		t2 = 1;
		for(int i=0;i<range;i++) {
			System.out.println(t1+" ");
			
			sum =  t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
