package practice;

public class StockPicker {
	
	static int stockPicker(int[] arr) { 
		  
		  int max_profit = -1;
		  int buy_price = 0;
		  int sell_price = 0;
		
		  boolean change_buy_index = true;
		  for (int i = 0; i < arr.length-1; i++) {
		    sell_price = arr[i+1]; 
		    if (change_buy_index) { 
		    	buy_price = arr[i]; 
		    	}
		    if (sell_price < buy_price) {
		      change_buy_index = true; 
		      continue;
		    } else { 
		      int temp_profit = sell_price - buy_price;
		      if (temp_profit > max_profit) { max_profit = temp_profit; }
		      change_buy_index = false;
		    }
		    
		  }
		  
		  return max_profit;
		         
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,5,1,6,8};
		System.out.println(stockPicker(arr));
	}

}
