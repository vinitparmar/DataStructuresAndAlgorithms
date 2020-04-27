package practice;

import java.util.ArrayList;

public class SpriralMatrix {
	static ArrayList<Integer> result = new ArrayList<>();
	static void calSpiralMatrix(int[][] array) {
		
		int startRow = 0;
		int endRow = array.length-1;
		int startColumn = 0;
		int endColumn = array[0].length-1;
		
		while(startRow <= endRow && startColumn <= endColumn) {
			for (int c = startColumn; c <=endColumn; c++) {
				result.add(array[startRow][c]);
			}
			
			for(int r = startRow+1 ; r <= endRow ; r++) {
				result.add(array[r][endColumn]);
			}
			
			for(int c = endColumn-1 ; c>=startColumn ;c--) {
				result.add(array[endRow][c]);
			}
			
			for(int r = endRow-1;r>startRow;r--) {
				if(startColumn == endColumn) break;
				
				result.add(array[r][startColumn]);
			}
			startRow++;
			startColumn++;
			endRow--;
			endColumn--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		calSpiralMatrix(arr);
		
		for(int i = 0 ;i<result.size();i++) {
			System.out.print(result.get(i)+" ");
		}
		
	}

}
